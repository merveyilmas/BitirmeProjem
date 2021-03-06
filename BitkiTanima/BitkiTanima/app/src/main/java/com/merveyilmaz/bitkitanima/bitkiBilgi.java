package com.merveyilmaz.bitkitanima;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class bitkiBilgi extends AppCompatActivity {

    ImageButton geriiButton;
    ImageView bitkiImage;
    TextView bitkiAdiText,bitkiBilgiText;

    private FirebaseAuth firebaseAuth;
    private FirebaseFirestore firebaseFirestore;
    private FirebaseStorage firebaseStorage;

    String bitkiAdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitki_bilgi);

        bitkiImage=findViewById(R.id.bitkiImage);
        bitkiBilgiText=findViewById(R.id.bitkiBilgiText);
        bitkiAdiText=findViewById(R.id.bitkiAdiText);

        bitkiAdi = getIntent().getExtras().getString("bitkiAdi");
        bitkiAdiText.setText(bitkiAdi);

        geriiButton=findViewById(R.id.geriiButton);
        geriiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(bitkiBilgi.this, bahcem.class);
                startActivity(gecisYap);
            }
        });

        //Firebase ??zelliklerini kullanabilmek i??in tan??mlad??k.
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseFirestore=FirebaseFirestore.getInstance();
        firebaseStorage=FirebaseStorage.getInstance();

        //verileri ??ekmek i??in olu??turdu??umuz fonksiyonu ??a????rd??k.
        getDataFromFirestore();

    }


    public void getDataFromFirestore(){

        //Olu??turdu??umuz BitkiBilgi collection daki verileri ??ekmek i??in tan??mlama yapt??k.
        CollectionReference collectionReference=firebaseFirestore.collection("BitkiBilgi");

        //Verileri firebaseden bitkiAd??na g??re bitki bilgilerini ??eken  fonksiyonumuzu yazd??k.
        collectionReference.whereEqualTo("bitkiAdi",bitkiAdi).addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {

                if(e!=null){
                    //Verileri ??ekerken hata ile kar????la????rsak uyar?? mesaj?? g??steriyor.
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage().toString(),Toast.LENGTH_SHORT).show();
                }
                if(queryDocumentSnapshots!=null){ //veriler al??nd??ysa
                    for(DocumentSnapshot snapshot: queryDocumentSnapshots.getDocuments()){

                        //al??nan de??erleri kullanabilmek i??in hash map e kaydettik.
                        Map<String,Object> data=snapshot.getData();

                            //hash map a kaydetti??imiz verileri de??i??kenlere atad??k.
                            String genelBilgi=(String) data.get("genelBilgi");
                            String dikimZaman??=(String) data.get("dikimZaman??");
                            String hasatZaman??=(String) data.get("hasatZaman??");
                            String budamaZaman??=(String) data.get("budamaZaman??");
                            String t??rleri=(String) data.get("t??rleri");
                            String faydalar??=(String) data.get("faydalar??");
                            String kullan??ld??????Yerler=(String) data.get("kullan??ld??????Yerler");
                            String bitkiFoto=(String) data.get("bitkiFotoUrl");

                            //foto??raflar??m??z?? g??r??nt??leyebilmek i??in picasso yap??s??n?? kulland??k.
                            Picasso.get().load(bitkiFoto).into(bitkiImage);

                            //de??i??kenlerdeki verileri text de g??sterdik.
                            bitkiBilgiText.setText("Genel bilgi:\n\n"+genelBilgi+"\n\n"+"Dikim Zaman??:\n\n"+dikimZaman??+"\n\n"+"Hasat Zaman??:\n\n"+hasatZaman??+"\n\n"+"Budama Zaman??:\n\n"+budamaZaman??+"\n\n"+"T??rleri:\n\n"+t??rleri+"\n\n"+"Faydalar??:\n\n"+faydalar??+"\n\n"+"Kullan??ld?????? yerler:\n\n"+kullan??ld??????Yerler+"\n\n");
                    }
                }

            }
        });
    }
}