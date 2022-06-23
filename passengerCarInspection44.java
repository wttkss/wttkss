public class passengerCarInspection extends Maintenance{
    private String type;
    private String date;
    private String mileage;
    private String period;

    public passengerCarInspection(String nameStation, String adressStation, String repairNameMachine, String repairType, String dateIn, String dateOut, String repairResult, String surnameEmploye, Integer price, String type, String date, String mileage, String period) {
        super(nameStation, adressStation, repairNameMachine, repairType, dateIn, dateOut, repairResult, surnameEmploye, price);
        this.type = type;
        this.date = date;
        this.mileage = mileage;
        this.period = period;
    }

    @Override
    public String toString() {
        return super.toString()+'\n'+
                "Плановый осмотр легкового автомобиля"+ '\n'+
                "Вид: " + type + '\n' +
                "Дата осмотра: " + date + '\n' +
                "Пробег: : " + mileage + '\n' +
                "Период: " + period + '\n';
    }
}
