abstract class Maintenance {
    private String nameStation;
    private String adressStation;
    private String repairNameMachine;
    private String repairType;
    private String dateIn;
    private String dateOut;
    private String repairResult;
    private String surnameEmploye;
    private Integer price;

    public Maintenance(String nameStation, String adressStation, String repairNameMachine, String repairType, String dateIn, String dateOut, String repairResult, String surnameEmploye, Integer price) {
        this.nameStation = nameStation;
        this.adressStation = adressStation;
        this.repairNameMachine = repairNameMachine;
        this.repairType = repairType;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.repairResult = repairResult;
        this.surnameEmploye = surnameEmploye;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название сервиса: " + nameStation + '\n' +
                "Адресс: " + adressStation + '\n' +
                "Название автомобиля: " + repairNameMachine + '\n' +
                "Вид работ: " + repairType + '\n' +
                "Дата поступления: " + dateIn + '\n' +
                "Дата выдачи: " + dateOut + '\n' +
                "Результат работы: " + repairResult + '\n' +
                "Фамилия персонала: " + surnameEmploye + '\n' +
                "Цена: " + price;
    }
}