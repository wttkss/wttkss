public class Main {
    public static void main(String[] args) {
        ServiceCenter serviceCenter = new ServiceCenter(
                "Сервис номер 1",
                "Ул. Ленина 260/1",
                "Honda Civic 2007",
                "Замена двигателя",
                "28.01.2022"
                );
        serviceCenter.setDateOut("15.02.2022");
        serviceCenter.setRepairResult("Заменённый двигаетль");
        serviceCenter.setSurnameEmploye("Антропов");
        serviceCenter.setPrice(75000);

        //System.out.println(serviceCenter.toString());

        WorkList workList = new WorkList();
        workList.addWork(new passengerCarInspection(
                "Сервис номер 1",
                "Ул. Ленина 260/1",
                "Honda Civic 2007",
                "Плановый осмотр",
                "28.01.2022",
                "15.02.2022",
                "Автомобиль осмотрен",
                "Терентьев",
                5000,
                "плановый",
                "2022",
                "150000",
                "3"
        ));
        workList.addWork(new Defect(
                "Сервис номер 1",
                "Ул. Ленина 260/1",
                "Honda Civic 2007",
                "Неисправность",
                "28.01.2022",
                "15.02.2022",
                "Неисправность устранена",
                "Терентьев",
                10000,
                "Замена шаровой",
                "Появился стук в подвеске, в ходе осмотра выявлена неисправность шаровой и произведена замена"
        ));
        workList.addWork(new cargoInspection(
                "Сервис номер 1",
                "Ул. Ленина 260/1",
                "Scania",
                "Плановый осмотр",
                "28.01.2022",
                "15.02.2022",
                "Автомобиль осмотрен",
                "Терентьев",
                15000,
                "ТО-1",
                "2022",
                "560000",
                "10",
                5.5
        ));
        workList.showAllWork();
    }
}
