package by.it.titkovskaya.jd02_09.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.io.Writer;

class ConverterJsonToXml<Bean> extends Converter<Bean> {

    ConverterJsonToXml(Class<Bean> beanClass) {
        super(beanClass);
    }

    @Override
    void load(String json) {
        System.out.println("\n=================== JSON ===================");
        System.out.println(json);
        Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
        Bean bean = gson.fromJson(json, getBeanClass());
        setBean(bean);
    }

    @Override
    String getText() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(getBeanClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            Writer writer = new StringWriter();
            marshaller.marshal(getBean(), writer);
            System.out.println("\n=================== XML output ===================");
            System.out.println(writer.toString());
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}
