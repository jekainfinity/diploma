import java.lang.reflect.Field

class ObjectBeanMapper<T,T1> {
        T object;

        ObjectBeanMapper(T object) {
            this.object = object
        }

        T1 mapConvert(Class<T1> clazz){
            def objectField = object.class.declaredFields.findAll{(!it.synthetic)};
            def beanField = bean.class.declaredFields.findAll{(!it.synthetic)};
            def overallField = objectField.findAll {beanField.collect {it.name}.contains(it.name) && beanField.collect {it.type}.contains(it.type)};
            return clazz.newInstance(overallField.collectEntries{[(it.name): object."$it.name"]})
        }
   }
