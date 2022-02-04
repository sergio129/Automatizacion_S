package co.konecta.sura.certificate.Interfaces.Listas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ListasAsociarListasPage {

    public static final Target BOTON_CREAR_ASOCIAR_LISTA = Target.the("Boton para la creacion de asociacion de listas ").located(By.id("btnSaveListRelations"));
    public static final Target CAMPO_LISTA_PADRE = Target.the("Campo lista padre").located(By.id("selectListFather"));
    public static final Target BUSCAR_LISTA_PADRE = Target.the("Buscamos lista padre").located(By.id("inputListFatherFilterSearch"));
    public static final Target CAMPO_OPCION_LISTA_PADRE = Target.the("Campo opcion lista padre").located(By.id("optionListFather"));
    public static final Target BUSCAR_OPCION_LISTA_PADRE = Target.the("Buscamos opcion lista padre").located(By.id("inputOptionListFatherSearch"));
    public static final Target CAMPO_LISTA_HIJA = Target.the("Campo lista hija").located(By.id("selectListDaughter"));
    public static final Target BUSCAR_LISTA_HIJA = Target.the("Buscamos lista hija").located(By.id("inputListDaughterFilterSearch"));
    public static final Target CAMPO_OPCION_LISTA_HIJA = Target.the("Campo lista hija").located(By.id("optionListDaughter"));
    public static final Target BUSCAR_OPCION_LISTA_HIJA = Target.the("Buscamos lista hija").located(By.id("inputOptionListDaughterFilterSearch"));
    public static final Target BOTON_GUARDAR_ASOCIAR_LISTA = Target.the("Guardamos Asociar Lista").located(By.id("btnSaveCreateRelation"));
    public static final Target CAMPO_LISTA_INICIO = Target.the("Campo lista inicio").located(By.id("searchSelectedListValue"));
    public static final Target BUSCAR_LISTA_INICIO = Target.the("buscar lista inicio").located(By.id("inputSelectedListValueSearch"));
    public static final Target CAMPO_OPCION_LISTA_INICIO = Target.the("Campo opcion lista inicio").located(By.id("searchOnListsOptions"));
    public static final Target BUSCAR_OPCION_LISTA_INICIO = Target.the("buscar opcion lista inicio").located(By.id("inputOnListsOptionsSearch"));

    public static final Target BOTON_EDITAR_ASOCIAR_LISTA = Target.the("Boton para editar asociar lista").located(By.id("btnEditRelationById"));
    public static final Target BOTON_ELIMINAR_ASOCIAR_LISTA = Target.the("Boton para editar asociar lista").located(By.id("btnDeleteRelationById"));
    public static final Target OPCION_SI_ELIMINAR_ASOCIAR_LISTA = Target.the("Boton para editar asociar lista").located(By.id("sweetalertConfirmButton"));














}
