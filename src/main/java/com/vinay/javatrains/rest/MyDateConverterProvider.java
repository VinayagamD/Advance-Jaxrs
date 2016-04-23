package com.vinay.javatrains.rest;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;

/**
 * Created by Vinay on 09-04-2016.
 */

@Provider
public class MyDateConverterProvider implements ParamConverterProvider {
    @Override
    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
        if (rawType.getName().equals(MyDate.class.getName())){

            return new ParamConverter<T>() {
                @Override
                public T fromString(String s) {
                    Calendar requestDate = Calendar.getInstance();
                    if (JaxrsTutorialConstant.TOMORROW.equalsIgnoreCase(s)){
                        requestDate.add(Calendar.DATE,1);
                    }else if (JaxrsTutorialConstant.YESTERDAY.equalsIgnoreCase(s)){
                        requestDate.add(Calendar.DATE,-1);
                    }
                    MyDate myDate = new MyDate();
                    myDate.setDate(requestDate.get(Calendar.DATE));
                    myDate.setMonth(requestDate.get(Calendar.MONTH));
                    myDate.setYear(requestDate.get(Calendar.YEAR));
                    return rawType.cast(myDate);
                }

                @Override
                public String toString(T t) {
                    return t==null?null:t.toString();
                }
            };

        }
        return null;
    }
}
