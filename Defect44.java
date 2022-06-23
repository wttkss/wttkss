public class Defect extends Maintenance{
    private String name;
    private String description;

    public Defect(String nameStation, String adressStation, String repairNameMachine, String repairType, String dateIn, String dateOut, String repairResult, String surnameEmploye, Integer price, String name, String description) {
        super(nameStation, adressStation, repairNameMachine, repairType, dateIn, dateOut, repairResult, surnameEmploye, price);
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()+'\n'+
                "Неисправность" + '\n'+
                "Название: " + name + '\n' +
                "Описание выполненых работ: " + description + '\n';
    }
}
