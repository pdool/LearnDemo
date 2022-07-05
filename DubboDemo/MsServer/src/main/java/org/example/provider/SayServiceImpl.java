package org.example.provider;

import org.apache.dubbo.config.annotation.DubboService;

import java.text.SimpleDateFormat;
import java.util.Date;

@DubboService(version = "1.0.0",timeout = 3000)
public class SayServiceImpl implements SayService {
    @Override
    public String sayHi(String uname) {
        Date dt = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        String time1 = sdf.format(dt);
        return time1+" -===- Hello , "+uname;
    }
}
