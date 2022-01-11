package co.konecta.sura.certificate.userinterface.cases.Novedades;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class NovedadesPage {

    public static final Target MODULE_EXPANSION_MANAGEMENTS = Target.the("This the expansion module Management").located(By.id("accordionNewsManagement"));
    public static final Target BUTTON_CREATE_MANAGEMENTS = Target.the("This the button create Management").located(By.id("createNewsManagement"));
    public static final Target INPUT_WHO_REPORTS_NEWS_MANAGEMENTS = Target.the("This the input management who reports Management").located(By.id("whoReportsNewsManagements"));
    public static final Target INPUT_WHO_FILTER_NEWS_MANAGEMENTS = Target.the("This the input search generates who reports Management").located(By.id("InputWhoRepNewsManagement"));
    public static final Target INPUT_CAUSE_NOVELTY_NEWS_MANAGEMENTS = Target.the("This the input search cause n news management").located(By.id("causeNoveltyNewsManagement"));
    public static final Target INPUT_CAUSE_FILTER_NEWS_MANAGEMENTS = Target.the("This the input search generates cause management").located(By.id("inputCauseNoveltyNewsManag"));
    public static final Target INPUT_COMPLAINT_NEWS_MANAGEMENTS = Target.the("This the input generates complaint management").located(By.id("ComplaintNewsManagement"));
    public static final Target INPUT_COMPLAINT_FILTER_NEWS_MANAGEMENTS = Target.the("This the input search generates complaint management").located(By.id("inputComplaintNewsManag"));
    public static final Target INPUT_OBSERVATION_NEWS_MANAGEMENTS = Target.the("This the input observation management").located(By.id("ObservationNewsManagement"));
    public static final Target INPUT_FILED_COMPLAINT_MANAGEMENTS = Target.the("This the input filed complaint management").located(By.id("filedComplaintNewsManagement"));
    public static final Target BUTTON_SAVE_MANAGEMENTS = Target.the("This the button save management").located(By.id("saveNewsManagement"));
    public static final Target BUTTON_EDIT_MANAGEMENTS = Target.the("This the button edit management").located(By.xpath("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-show-cases/mat-accordion/app-list-news-management/mat-expansion-panel/div/div/div/mat-table/mat-row[1]/mat-cell[7]/button/span/mat-icon"));
    public static final Target BUTTON_CANCEL_MANAGEMENTS = Target.the("This the button cancel management").located(By.id("cancelNewsManagement"));


}


