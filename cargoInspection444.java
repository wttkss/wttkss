public class cargoInspection extends Maintenance{
    private String type;
    private String date;
    private String mileage;
    private String period;
    private Double engineVolume;

    public cargoInspection(String nameStation, String adressStation, String repairNameMachine, String repairType, String dateIn, String dateOut, String repairResult, String surnameEmploye, Integer price, String type, String date, String mileage, String period, Double engineVolume) {
        super(nameStation, adressStation, repairNameMachine, repairType, dateIn, dateOut, repairResult, surnameEmploye, price);
        this.type = type;
        this.date = date;
        this.mileage = mileage;
        this.period = period;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Плановый осмотр грузового автомобиля:" + '\n'+
                "Вид: " + type + '\n' +
                "Дата: " + date + '\n' +
                "Пробег: " + mileage + '\n' +
                "Период: " + period + '\n' +
                "Объём двигателя: " + engineVolume + " л.";
    }
}
