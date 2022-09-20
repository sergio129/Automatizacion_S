package co.konecta.sura.certificate.Tareas.BD;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.bson.Document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ConexionBD implements Task {
    private MongoClient mongoClient;    // Java MongoDB client (Cliente Java MongoDB)
    private MongoDatabase mongodb;      // Database object (Objeto base de datos)
    private String Conexion;
    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";

    public ConexionBD ConexionBD(ConexionBD Conexion) {
        return Conexion;
    }

    public Performable connectDatabase() {
        setMongoClient(new MongoClient("localhost", 27017));
        setMongodb(getMongoClient().getDatabase("AutomatizacionSura"));
        return null;
    }

    public Performable Reporte(String sara) {
        FindIterable<Document> iterable = getMongodb().getCollection("Sara").find();
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document);
            }
        });
        return null;
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


    @Override
    public <T extends Actor> void performAs(T sergio) {

        ConexionBD javaMongodbList = new ConexionBD();
        sergio.has(
                javaMongodbList.connectDatabase(),
                javaMongodbList.Reporte("Sara"));
        System.out.println("Prueba conexión MongoDB");

    }

    public static ConexionBD Conectar() {
        return instrumented(ConexionBD.class);
    }
//Insertar datos


    public void leerArchivo() throws IOException {
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader("C:\\Users\\Sergio\\Desktop\\backlog-sura-asistencia-automatizacion_nuevo_patron\\target\\site\\serenity\\results.csv"));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(SEPARATOR);
                System.out.println(Arrays.toString(fields));
                fields = removeTrailingQuotes(fields);
                System.out.println(Arrays.toString(fields));
                line = br.readLine();
                int contador = 1;

                String Story = line;
                switch (contador) {
                    case 1:
                        Story = line;
                        contador++;
                        break;

                }
                getMongodb().getCollection("Sara").insertOne(
                        new Document((
                                new Document()
                                        .append("Story", Story))));
                System.out.println("Insercion Exitosa");
            }


        } catch (Exception e) {

        } finally {
            if (null != br) {
                br.close();
            }

        }
    }

    public String[] removeTrailingQuotes(String[] fields) {
        String result[] = new String[fields.length];
        for (int i = 1; i < result.length; i++) {
            result[i] = fields[i].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");
        }
        return fields;

    }

    public void insertOneDataTest() {

        // We add a document to the database directly (Añadimos un documento a la base de datos directamente).

    }
}



