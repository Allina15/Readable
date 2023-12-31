public class Magazine extends News implements Readable{
    public Magazine(String name, int pages) {
        super(name, pages);
    }

    @Override
    public void read() {
        System.out.println("PeakSoft House - бул PeakSoft ITкомпаниясынын онлайн жана офлайн окутуу курстары. Биз талап кылынган Back-end (Java) жана Front-end (JavaScript), IT адистерин online - offline даярдайбыз. Нолдон баштап биринчи жумуш күнүнө чейин.\n" +
                "\n" +
                "Peaksoft House - сан эмес,сапат үчүн иштейт. Себеби биздин программада темаларды бышыктоо үчүн, окуунун ар бир этабында студенттерге сынактар каралган. Эгерде студент окуунун бир этабын жакшы өздөштүрө албаса, кайра ошол этапты окууга туура келет же болбосо окуудан четтетилет.\n" +
                "\n" +
                "Peaksoft House 2020 - жылы ноябрь айында негизделген. Эн алгач окутуу онлайн форматында гана өткөрүлгөн. 2021-жылы июнь айында Бишкекте кампус ачылып, окутуунун офлайн форматы дагы киргизилген. Азыркы учурда Кыргызстанда гана эмес, Москва шаарында дагы филиалыбыз бар,ошол эле учурда дүйнө жүзү боюнча кыргыз тилинде билим алгысы келген студенттер онлайн форматында окушат.\n" +
                "\n" +
                "Бугүнкү күндө Peaksoft House тан Java жана JavaScript тилдери боюнча студенттер ийгиликтүү окууну аяктап, 70-80 %ти IT адистери болуп эмгектенип жатышат.");
    }
}
