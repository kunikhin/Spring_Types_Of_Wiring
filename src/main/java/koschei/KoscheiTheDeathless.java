package koschei;

import koschei.models.Ocean1;
import koschei.models.Rabbit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;
    private Rabbit4 rabbit;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
    @Autowired
    public void setRabbit(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }
}
