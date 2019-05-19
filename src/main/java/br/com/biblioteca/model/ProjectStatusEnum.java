package br.com.biblioteca.model;

public enum ProjectStatusEnum {

    ANALYZE("em análise"),

    ANALYZED_ANALYSIS("análise realizada"),

    APPROVED_ANALYSIS("análise aprovada"),

    INITIATED("iniciado"),

    PLANNED("planejado"),

    IN_PROGRESS("em andamento"),

    CLOSED("encerrado"),

    CANCELED("cancelado");


    ProjectStatusEnum(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.name();
    }
}
