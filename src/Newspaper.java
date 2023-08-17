public class Newspaper extends News implements Readable{
    public Newspaper(String name, int pages) {
        super(name, pages);
    }

    @Override
    public void read() {
        System.out.println("Млечный Путь (Галактика) — спиральная галактика с перемычкой, в которой находится Земля и Солнечная система. Радиус звёздного диска Млечного Пути и радиус Галактики составляют 16 килопарсек. Полная масса Галак");
    }
}
