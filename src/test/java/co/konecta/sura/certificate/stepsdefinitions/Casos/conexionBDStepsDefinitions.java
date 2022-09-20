package co.konecta.sura.certificate.stepsdefinitions.Casos;


import co.konecta.sura.certificate.Tareas.BD.ConexionBD;
import co.konecta.sura.certificate.Tareas.BD.JavaMongodbInsertData;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.bson.Document;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.Arrays.asList;


public class conexionBDStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    private MongoClient mongoClient;    // Java MongoDB client (Cliente Java MongoDB)
    private MongoDatabase mongodb;      // Database object (Objeto base de datos)

    public void connectDatabase() {
        setMongoClient(new MongoClient("localhost", 27017));
        setMongodb(getMongoClient().getDatabase("AutomatizacionSura"));
    }

    public void Reporte() {
        // Para devolver todos los documentos en una colección, llamamos al método find sin ningún documento
        FindIterable<Document> iterable = getMongodb().getCollection("Sara").find();
        // Iteramos los resultados y aplicacimos un bloque para cada documento.
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document);
            }
        });

    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getMongodb() {
        return mongodb;
    }

    public void setMongodb(MongoDatabase mongodb) {
        this.mongodb = mongodb;
    }

    @And("hacemos conexion Base de datos")
    public void hacemosConexionBaseDeDatos() throws IOException {
        ConexionBD javaMongodbList = new ConexionBD();
        javaMongodbList.connectDatabase();
        javaMongodbList.Reporte("Sara");
        javaMongodbList.insertOneDataTest();
        javaMongodbList.leerArchivo();
        System.out.println("Prueba conexión MongoDB");


    }
}


