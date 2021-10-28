module com.minf1_git.minf_ue1_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.minf1_git.minf_ue1_git to javafx.fxml;
    exports com.minf1_git.minf_ue1_git;
}