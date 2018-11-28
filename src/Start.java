public class Start {
    public static void main(String[] args) {
        RobotManager manager = new RobotManager();
        manager.addPrototype("A");
        manager.addPrototype("B");
        manager.addPrototype("C");
        manager.addPrototype("D");

        ElektroFactory fabryka = new ElektroFactory(manager);
        System.out.println(fabryka.getProduct(ElektroFactory.ProductType.telewizor_marki_Retro_wisla_3));
        System.out.println(fabryka.getProduct(ElektroFactory.ProductType.toster_pneumatyczny));
        System.out.println(fabryka.getProduct(ElektroFactory.ProductType.hydrokinetyczna_obieraczka_do_bananow));
    }
}

