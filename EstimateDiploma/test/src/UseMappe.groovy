
class UseMappe {

    public static void main(String[] args) {
        ObjectBeanMapper<Objectt, Bean> objectBeanMapper = new ObjectBeanMapper(new Objectt(name: "Jeka", descript: "Palyvodda", address: "chehova"),new Bean());
        Bean bean = objectBeanMapper.mapConvert(Bean.class)
    }
}
