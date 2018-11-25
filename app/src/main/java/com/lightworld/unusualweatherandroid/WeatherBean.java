package com.lightworld.unusualweatherandroid;

import java.util.List;

public class WeatherBean {

    /**
     * status : ok
     * lang : zh_CN
     * result : {"hourly":{"status":"ok","description":"多云，云渐少，明天凌晨3点钟后转至晴","skycon":[{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 20:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 21:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 22:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 23:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 00:00"},{"value":"RAIN","datetime":"2018-11-25 01:00"},{"value":"RAIN","datetime":"2018-11-25 02:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 03:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 04:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 05:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 06:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 07:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 08:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 09:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 10:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 11:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 12:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 13:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 14:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 15:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 16:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 17:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 18:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 19:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 20:00"},{"value":"CLOUDY","datetime":"2018-11-25 21:00"},{"value":"CLOUDY","datetime":"2018-11-25 22:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 23:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 00:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 01:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 02:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 03:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 04:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 05:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 06:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2018-11-26 07:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2018-11-26 08:00"},{"value":"CLOUDY","datetime":"2018-11-26 09:00"},{"value":"CLOUDY","datetime":"2018-11-26 10:00"},{"value":"CLOUDY","datetime":"2018-11-26 11:00"},{"value":"CLOUDY","datetime":"2018-11-26 12:00"},{"value":"CLOUDY","datetime":"2018-11-26 13:00"},{"value":"CLOUDY","datetime":"2018-11-26 14:00"},{"value":"RAIN","datetime":"2018-11-26 15:00"},{"value":"RAIN","datetime":"2018-11-26 16:00"},{"value":"RAIN","datetime":"2018-11-26 17:00"},{"value":"RAIN","datetime":"2018-11-26 18:00"},{"value":"RAIN","datetime":"2018-11-26 19:00"}],"cloudrate":[{"value":0.58,"datetime":"2018-11-24 20:00"},{"value":0.61,"datetime":"2018-11-24 21:00"},{"value":0.77,"datetime":"2018-11-24 22:00"},{"value":0.67,"datetime":"2018-11-24 23:00"},{"value":0.6,"datetime":"2018-11-25 00:00"},{"value":0.53,"datetime":"2018-11-25 01:00"},{"value":0.41,"datetime":"2018-11-25 02:00"},{"value":0.02,"datetime":"2018-11-25 03:00"},{"value":0.01,"datetime":"2018-11-25 04:00"},{"value":0.01,"datetime":"2018-11-25 05:00"},{"value":0.01,"datetime":"2018-11-25 06:00"},{"value":0,"datetime":"2018-11-25 07:00"},{"value":0,"datetime":"2018-11-25 08:00"},{"value":0.14,"datetime":"2018-11-25 09:00"},{"value":0.07,"datetime":"2018-11-25 10:00"},{"value":0.05,"datetime":"2018-11-25 11:00"},{"value":0.04,"datetime":"2018-11-25 12:00"},{"value":0.03,"datetime":"2018-11-25 13:00"},{"value":0.03,"datetime":"2018-11-25 14:00"},{"value":0,"datetime":"2018-11-25 15:00"},{"value":0,"datetime":"2018-11-25 16:00"},{"value":0.1,"datetime":"2018-11-25 17:00"},{"value":0.26,"datetime":"2018-11-25 18:00"},{"value":0.35,"datetime":"2018-11-25 19:00"},{"value":0.42,"datetime":"2018-11-25 20:00"},{"value":0.92,"datetime":"2018-11-25 21:00"},{"value":0.81,"datetime":"2018-11-25 22:00"},{"value":0.69,"datetime":"2018-11-25 23:00"},{"value":0.66,"datetime":"2018-11-26 00:00"},{"value":0.67,"datetime":"2018-11-26 01:00"},{"value":0.67,"datetime":"2018-11-26 02:00"},{"value":0.62,"datetime":"2018-11-26 03:00"},{"value":0.72,"datetime":"2018-11-26 04:00"},{"value":0.69,"datetime":"2018-11-26 05:00"},{"value":0.68,"datetime":"2018-11-26 06:00"},{"value":0.71,"datetime":"2018-11-26 07:00"},{"value":0.73,"datetime":"2018-11-26 08:00"},{"value":0.98,"datetime":"2018-11-26 09:00"},{"value":0.89,"datetime":"2018-11-26 10:00"},{"value":0.85,"datetime":"2018-11-26 11:00"},{"value":0.85,"datetime":"2018-11-26 12:00"},{"value":0.85,"datetime":"2018-11-26 13:00"},{"value":0.85,"datetime":"2018-11-26 14:00"},{"value":0.96,"datetime":"2018-11-26 15:00"},{"value":0.97,"datetime":"2018-11-26 16:00"},{"value":0.97,"datetime":"2018-11-26 17:00"},{"value":0.96,"datetime":"2018-11-26 18:00"},{"value":0.96,"datetime":"2018-11-26 19:00"}],"aqi":[{"value":32,"datetime":"2018-11-24 20:00"},{"value":20,"datetime":"2018-11-24 21:00"},{"value":21,"datetime":"2018-11-24 22:00"},{"value":23,"datetime":"2018-11-24 23:00"},{"value":26,"datetime":"2018-11-25 00:00"},{"value":27,"datetime":"2018-11-25 01:00"},{"value":27,"datetime":"2018-11-25 02:00"},{"value":29,"datetime":"2018-11-25 03:00"},{"value":30,"datetime":"2018-11-25 04:00"},{"value":30,"datetime":"2018-11-25 05:00"},{"value":31,"datetime":"2018-11-25 06:00"},{"value":31,"datetime":"2018-11-25 07:00"},{"value":31,"datetime":"2018-11-25 08:00"},{"value":31,"datetime":"2018-11-25 09:00"},{"value":33,"datetime":"2018-11-25 10:00"},{"value":33,"datetime":"2018-11-25 11:00"},{"value":33,"datetime":"2018-11-25 12:00"},{"value":33,"datetime":"2018-11-25 13:00"},{"value":33,"datetime":"2018-11-25 14:00"},{"value":33,"datetime":"2018-11-25 15:00"},{"value":33,"datetime":"2018-11-25 16:00"},{"value":34,"datetime":"2018-11-25 17:00"},{"value":36,"datetime":"2018-11-25 18:00"},{"value":37,"datetime":"2018-11-25 19:00"},{"value":39,"datetime":"2018-11-25 20:00"},{"value":40,"datetime":"2018-11-25 21:00"},{"value":40,"datetime":"2018-11-25 22:00"},{"value":41,"datetime":"2018-11-25 23:00"},{"value":43,"datetime":"2018-11-26 00:00"},{"value":43,"datetime":"2018-11-26 01:00"},{"value":43,"datetime":"2018-11-26 02:00"},{"value":41,"datetime":"2018-11-26 03:00"},{"value":40,"datetime":"2018-11-26 04:00"},{"value":39,"datetime":"2018-11-26 05:00"},{"value":37,"datetime":"2018-11-26 06:00"},{"value":37,"datetime":"2018-11-26 07:00"},{"value":37,"datetime":"2018-11-26 08:00"},{"value":36,"datetime":"2018-11-26 09:00"},{"value":36,"datetime":"2018-11-26 10:00"},{"value":36,"datetime":"2018-11-26 11:00"},{"value":36,"datetime":"2018-11-26 12:00"},{"value":36,"datetime":"2018-11-26 13:00"},{"value":36,"datetime":"2018-11-26 14:00"},{"value":36,"datetime":"2018-11-26 15:00"},{"value":37,"datetime":"2018-11-26 16:00"},{"value":37,"datetime":"2018-11-26 17:00"},{"value":39,"datetime":"2018-11-26 18:00"},{"value":39,"datetime":"2018-11-26 19:00"}],"dswrf":[{"value":103.6064256,"datetime":"2018-11-24 20:00"},{"value":0,"datetime":"2018-11-24 21:00"},{"value":0,"datetime":"2018-11-24 22:00"},{"value":0,"datetime":"2018-11-24 23:00"},{"value":0,"datetime":"2018-11-25 00:00"},{"value":0,"datetime":"2018-11-25 01:00"},{"value":0,"datetime":"2018-11-25 02:00"},{"value":0,"datetime":"2018-11-25 03:00"},{"value":0,"datetime":"2018-11-25 04:00"},{"value":0,"datetime":"2018-11-25 05:00"},{"value":0,"datetime":"2018-11-25 06:00"},{"value":7.6260608,"datetime":"2018-11-25 07:00"},{"value":36.52521216,"datetime":"2018-11-25 08:00"},{"value":390,"datetime":"2018-11-25 09:00"},{"value":473.792,"datetime":"2018-11-25 10:00"},{"value":537.6260608,"datetime":"2018-11-25 11:00"},{"value":581.4500608,"datetime":"2018-11-25 12:00"},{"value":603.792,"datetime":"2018-11-25 13:00"},{"value":603.792,"datetime":"2018-11-25 14:00"},{"value":450,"datetime":"2018-11-25 15:00"},{"value":355.2841216,"datetime":"2018-11-25 16:00"},{"value":257.6260608,"datetime":"2018-11-25 17:00"},{"value":190,"datetime":"2018-11-25 18:00"},{"value":151.4500608,"datetime":"2018-11-25 19:00"},{"value":128.43282432,"datetime":"2018-11-25 20:00"},{"value":0,"datetime":"2018-11-25 21:00"},{"value":0,"datetime":"2018-11-25 22:00"},{"value":0,"datetime":"2018-11-25 23:00"},{"value":0,"datetime":"2018-11-26 00:00"},{"value":0,"datetime":"2018-11-26 01:00"},{"value":0,"datetime":"2018-11-26 02:00"},{"value":0,"datetime":"2018-11-26 03:00"},{"value":0,"datetime":"2018-11-26 04:00"},{"value":0,"datetime":"2018-11-26 05:00"},{"value":0,"datetime":"2018-11-26 06:00"},{"value":0,"datetime":"2018-11-26 07:00"},{"value":11.31602432,"datetime":"2018-11-26 08:00"},{"value":73.9844864,"datetime":"2018-11-26 09:00"},{"value":157.8135808,"datetime":"2018-11-26 10:00"},{"value":241.3560064,"datetime":"2018-11-26 11:00"},{"value":289.5503104,"datetime":"2018-11-26 12:00"},{"value":313.2783104,"datetime":"2018-11-26 13:00"},{"value":305.6202496,"datetime":"2018-11-26 14:00"},{"value":103.972608,"datetime":"2018-11-26 15:00"},{"value":72.5124864,"datetime":"2018-11-26 16:00"},{"value":53.4363648,"datetime":"2018-11-26 17:00"},{"value":41.986304,"datetime":"2018-11-26 18:00"},{"value":34.3602432,"datetime":"2018-11-26 19:00"}],"visibility":[{"value":23.28,"datetime":"2018-11-24 20:00"},{"value":21.88,"datetime":"2018-11-24 21:00"},{"value":21.91,"datetime":"2018-11-24 22:00"},{"value":22.29,"datetime":"2018-11-24 23:00"},{"value":22.71,"datetime":"2018-11-25 00:00"},{"value":23.3,"datetime":"2018-11-25 01:00"},{"value":23.47,"datetime":"2018-11-25 02:00"},{"value":24.1,"datetime":"2018-11-25 03:00"},{"value":24.1,"datetime":"2018-11-25 04:00"},{"value":24.1,"datetime":"2018-11-25 05:00"},{"value":24.1,"datetime":"2018-11-25 06:00"},{"value":24.1,"datetime":"2018-11-25 07:00"},{"value":24.1,"datetime":"2018-11-25 08:00"},{"value":24.1,"datetime":"2018-11-25 09:00"},{"value":24.1,"datetime":"2018-11-25 10:00"},{"value":24.1,"datetime":"2018-11-25 11:00"},{"value":24.1,"datetime":"2018-11-25 12:00"},{"value":24.1,"datetime":"2018-11-25 13:00"},{"value":24.1,"datetime":"2018-11-25 14:00"},{"value":24.1,"datetime":"2018-11-25 15:00"},{"value":24.1,"datetime":"2018-11-25 16:00"},{"value":23.17,"datetime":"2018-11-25 17:00"},{"value":23.33,"datetime":"2018-11-25 18:00"},{"value":23.53,"datetime":"2018-11-25 19:00"},{"value":23.47,"datetime":"2018-11-25 20:00"},{"value":23.45,"datetime":"2018-11-25 21:00"},{"value":23.45,"datetime":"2018-11-25 22:00"},{"value":23.43,"datetime":"2018-11-25 23:00"},{"value":23.55,"datetime":"2018-11-26 00:00"},{"value":23.88,"datetime":"2018-11-26 01:00"},{"value":23.95,"datetime":"2018-11-26 02:00"},{"value":23.94,"datetime":"2018-11-26 03:00"},{"value":23.52,"datetime":"2018-11-26 04:00"},{"value":23.18,"datetime":"2018-11-26 05:00"},{"value":23.13,"datetime":"2018-11-26 06:00"},{"value":23.37,"datetime":"2018-11-26 07:00"},{"value":23.45,"datetime":"2018-11-26 08:00"},{"value":23.27,"datetime":"2018-11-26 09:00"},{"value":23.79,"datetime":"2018-11-26 10:00"},{"value":23.61,"datetime":"2018-11-26 11:00"},{"value":23.78,"datetime":"2018-11-26 12:00"},{"value":20.3,"datetime":"2018-11-26 13:00"},{"value":23.09,"datetime":"2018-11-26 14:00"},{"value":21.1,"datetime":"2018-11-26 15:00"},{"value":22.08,"datetime":"2018-11-26 16:00"},{"value":18.97,"datetime":"2018-11-26 17:00"},{"value":21.92,"datetime":"2018-11-26 18:00"},{"value":14.85,"datetime":"2018-11-26 19:00"}],"humidity":[{"value":0.8,"datetime":"2018-11-24 20:00"},{"value":0.8,"datetime":"2018-11-24 21:00"},{"value":0.78,"datetime":"2018-11-24 22:00"},{"value":0.77,"datetime":"2018-11-24 23:00"},{"value":0.78,"datetime":"2018-11-25 00:00"},{"value":0.78,"datetime":"2018-11-25 01:00"},{"value":0.81,"datetime":"2018-11-25 02:00"},{"value":0.8,"datetime":"2018-11-25 03:00"},{"value":0.81,"datetime":"2018-11-25 04:00"},{"value":0.82,"datetime":"2018-11-25 05:00"},{"value":0.82,"datetime":"2018-11-25 06:00"},{"value":0.82,"datetime":"2018-11-25 07:00"},{"value":0.77,"datetime":"2018-11-25 08:00"},{"value":0.73,"datetime":"2018-11-25 09:00"},{"value":0.69,"datetime":"2018-11-25 10:00"},{"value":0.67,"datetime":"2018-11-25 11:00"},{"value":0.65,"datetime":"2018-11-25 12:00"},{"value":0.65,"datetime":"2018-11-25 13:00"},{"value":0.66,"datetime":"2018-11-25 14:00"},{"value":0.67,"datetime":"2018-11-25 15:00"},{"value":0.7,"datetime":"2018-11-25 16:00"},{"value":0.75,"datetime":"2018-11-25 17:00"},{"value":0.77,"datetime":"2018-11-25 18:00"},{"value":0.78,"datetime":"2018-11-25 19:00"},{"value":0.79,"datetime":"2018-11-25 20:00"},{"value":0.8,"datetime":"2018-11-25 21:00"},{"value":0.81,"datetime":"2018-11-25 22:00"},{"value":0.82,"datetime":"2018-11-25 23:00"},{"value":0.82,"datetime":"2018-11-26 00:00"},{"value":0.82,"datetime":"2018-11-26 01:00"},{"value":0.82,"datetime":"2018-11-26 02:00"},{"value":0.81,"datetime":"2018-11-26 03:00"},{"value":0.8,"datetime":"2018-11-26 04:00"},{"value":0.8,"datetime":"2018-11-26 05:00"},{"value":0.8,"datetime":"2018-11-26 06:00"},{"value":0.79,"datetime":"2018-11-26 07:00"},{"value":0.77,"datetime":"2018-11-26 08:00"},{"value":0.78,"datetime":"2018-11-26 09:00"},{"value":0.75,"datetime":"2018-11-26 10:00"},{"value":0.72,"datetime":"2018-11-26 11:00"},{"value":0.71,"datetime":"2018-11-26 12:00"},{"value":0.71,"datetime":"2018-11-26 13:00"},{"value":0.74,"datetime":"2018-11-26 14:00"},{"value":0.79,"datetime":"2018-11-26 15:00"},{"value":0.83,"datetime":"2018-11-26 16:00"},{"value":0.85,"datetime":"2018-11-26 17:00"},{"value":0.86,"datetime":"2018-11-26 18:00"},{"value":0.87,"datetime":"2018-11-26 19:00"}],"pres":[{"value":100550.2003200001,"datetime":"2018-11-24 20:00"},{"value":100599.8643200001,"datetime":"2018-11-24 21:00"},{"value":100599.8643200001,"datetime":"2018-11-24 22:00"},{"value":100599.8643200001,"datetime":"2018-11-24 23:00"},{"value":100550.20032,"datetime":"2018-11-25 00:00"},{"value":100470.2003200001,"datetime":"2018-11-25 01:00"},{"value":100439.8643200001,"datetime":"2018-11-25 02:00"},{"value":100390.2003200001,"datetime":"2018-11-25 03:00"},{"value":100359.8643200001,"datetime":"2018-11-25 04:00"},{"value":100371.4648064001,"datetime":"2018-11-25 05:00"},{"value":100390.2003200001,"datetime":"2018-11-25 06:00"},{"value":100390.2003200001,"datetime":"2018-11-25 07:00"},{"value":100390.2003200001,"datetime":"2018-11-25 08:00"},{"value":100409.1918336001,"datetime":"2018-11-25 09:00"},{"value":100409.1918336001,"datetime":"2018-11-25 10:00"},{"value":100390.2003200001,"datetime":"2018-11-25 11:00"},{"value":100310.2003200001,"datetime":"2018-11-25 12:00"},{"value":100230.2003200001,"datetime":"2018-11-25 13:00"},{"value":100169.1918336001,"datetime":"2018-11-25 14:00"},{"value":100169.1918336001,"datetime":"2018-11-25 15:00"},{"value":100169.1918336001,"datetime":"2018-11-25 16:00"},{"value":100230.2003200001,"datetime":"2018-11-25 17:00"},{"value":100230.2003200001,"datetime":"2018-11-25 18:00"},{"value":100249.1918336001,"datetime":"2018-11-25 19:00"},{"value":100310.20032,"datetime":"2018-11-25 20:00"},{"value":100329.1918336001,"datetime":"2018-11-25 21:00"},{"value":100329.1918336001,"datetime":"2018-11-25 22:00"},{"value":100310.2003200001,"datetime":"2018-11-25 23:00"},{"value":100310.20032,"datetime":"2018-11-26 00:00"},{"value":100260.7923200001,"datetime":"2018-11-26 01:00"},{"value":100211.4648064001,"datetime":"2018-11-26 02:00"},{"value":100180.7923200001,"datetime":"2018-11-26 03:00"},{"value":100180.7923200001,"datetime":"2018-11-26 04:00"},{"value":100180.7923200001,"datetime":"2018-11-26 05:00"},{"value":100260.79232,"datetime":"2018-11-26 06:00"},{"value":100390.4563200001,"datetime":"2018-11-26 07:00"},{"value":100420.7923200001,"datetime":"2018-11-26 08:00"},{"value":100489.1918336001,"datetime":"2018-11-26 09:00"},{"value":100470.4563200001,"datetime":"2018-11-26 10:00"},{"value":100409.1918336001,"datetime":"2018-11-26 11:00"},{"value":100390.4563200001,"datetime":"2018-11-26 12:00"},{"value":100291.4648064001,"datetime":"2018-11-26 13:00"},{"value":100230.4563200001,"datetime":"2018-11-26 14:00"},{"value":100310.4563200001,"datetime":"2018-11-26 15:00"},{"value":100260.7923200001,"datetime":"2018-11-26 16:00"},{"value":100310.4563200001,"datetime":"2018-11-26 17:00"},{"value":100420.7923200001,"datetime":"2018-11-26 18:00"},{"value":100489.1918336001,"datetime":"2018-11-26 19:00"}],"pm25":[{"value":12,"datetime":"2018-11-24 20:00"},{"value":14,"datetime":"2018-11-24 21:00"},{"value":15,"datetime":"2018-11-24 22:00"},{"value":16,"datetime":"2018-11-24 23:00"},{"value":18,"datetime":"2018-11-25 00:00"},{"value":19,"datetime":"2018-11-25 01:00"},{"value":19,"datetime":"2018-11-25 02:00"},{"value":20,"datetime":"2018-11-25 03:00"},{"value":21,"datetime":"2018-11-25 04:00"},{"value":21,"datetime":"2018-11-25 05:00"},{"value":22,"datetime":"2018-11-25 06:00"},{"value":22,"datetime":"2018-11-25 07:00"},{"value":22,"datetime":"2018-11-25 08:00"},{"value":22,"datetime":"2018-11-25 09:00"},{"value":23,"datetime":"2018-11-25 10:00"},{"value":23,"datetime":"2018-11-25 11:00"},{"value":23,"datetime":"2018-11-25 12:00"},{"value":23,"datetime":"2018-11-25 13:00"},{"value":23,"datetime":"2018-11-25 14:00"},{"value":23,"datetime":"2018-11-25 15:00"},{"value":23,"datetime":"2018-11-25 16:00"},{"value":24,"datetime":"2018-11-25 17:00"},{"value":25,"datetime":"2018-11-25 18:00"},{"value":26,"datetime":"2018-11-25 19:00"},{"value":27,"datetime":"2018-11-25 20:00"},{"value":28,"datetime":"2018-11-25 21:00"},{"value":28,"datetime":"2018-11-25 22:00"},{"value":29,"datetime":"2018-11-25 23:00"},{"value":30,"datetime":"2018-11-26 00:00"},{"value":30,"datetime":"2018-11-26 01:00"},{"value":30,"datetime":"2018-11-26 02:00"},{"value":29,"datetime":"2018-11-26 03:00"},{"value":28,"datetime":"2018-11-26 04:00"},{"value":27,"datetime":"2018-11-26 05:00"},{"value":26,"datetime":"2018-11-26 06:00"},{"value":26,"datetime":"2018-11-26 07:00"},{"value":26,"datetime":"2018-11-26 08:00"},{"value":25,"datetime":"2018-11-26 09:00"},{"value":25,"datetime":"2018-11-26 10:00"},{"value":25,"datetime":"2018-11-26 11:00"},{"value":25,"datetime":"2018-11-26 12:00"},{"value":25,"datetime":"2018-11-26 13:00"},{"value":25,"datetime":"2018-11-26 14:00"},{"value":25,"datetime":"2018-11-26 15:00"},{"value":26,"datetime":"2018-11-26 16:00"},{"value":26,"datetime":"2018-11-26 17:00"},{"value":27,"datetime":"2018-11-26 18:00"},{"value":27,"datetime":"2018-11-26 19:00"}],"precipitation":[{"value":0,"datetime":"2018-11-24 20:00"},{"value":0,"datetime":"2018-11-24 21:00"},{"value":0,"datetime":"2018-11-24 22:00"},{"value":0,"datetime":"2018-11-24 23:00"},{"value":0.057,"datetime":"2018-11-25 00:00"},{"value":0.0644,"datetime":"2018-11-25 01:00"},{"value":0.0644,"datetime":"2018-11-25 02:00"},{"value":0,"datetime":"2018-11-25 03:00"},{"value":0,"datetime":"2018-11-25 04:00"},{"value":0,"datetime":"2018-11-25 05:00"},{"value":0,"datetime":"2018-11-25 06:00"},{"value":0,"datetime":"2018-11-25 07:00"},{"value":0,"datetime":"2018-11-25 08:00"},{"value":0,"datetime":"2018-11-25 09:00"},{"value":0,"datetime":"2018-11-25 10:00"},{"value":0,"datetime":"2018-11-25 11:00"},{"value":0,"datetime":"2018-11-25 12:00"},{"value":0,"datetime":"2018-11-25 13:00"},{"value":0,"datetime":"2018-11-25 14:00"},{"value":0,"datetime":"2018-11-25 15:00"},{"value":0,"datetime":"2018-11-25 16:00"},{"value":0,"datetime":"2018-11-25 17:00"},{"value":0,"datetime":"2018-11-25 18:00"},{"value":0,"datetime":"2018-11-25 19:00"},{"value":0,"datetime":"2018-11-25 20:00"},{"value":0,"datetime":"2018-11-25 21:00"},{"value":0,"datetime":"2018-11-25 22:00"},{"value":0,"datetime":"2018-11-25 23:00"},{"value":0,"datetime":"2018-11-26 00:00"},{"value":0,"datetime":"2018-11-26 01:00"},{"value":0,"datetime":"2018-11-26 02:00"},{"value":0,"datetime":"2018-11-26 03:00"},{"value":0,"datetime":"2018-11-26 04:00"},{"value":0,"datetime":"2018-11-26 05:00"},{"value":0,"datetime":"2018-11-26 06:00"},{"value":0,"datetime":"2018-11-26 07:00"},{"value":0,"datetime":"2018-11-26 08:00"},{"value":0,"datetime":"2018-11-26 09:00"},{"value":0,"datetime":"2018-11-26 10:00"},{"value":0,"datetime":"2018-11-26 11:00"},{"value":0,"datetime":"2018-11-26 12:00"},{"value":0,"datetime":"2018-11-26 13:00"},{"value":0,"datetime":"2018-11-26 14:00"},{"value":0.1437,"datetime":"2018-11-26 15:00"},{"value":0.1127,"datetime":"2018-11-26 16:00"},{"value":0.0817,"datetime":"2018-11-26 17:00"},{"value":0.0796,"datetime":"2018-11-26 18:00"},{"value":0.0725,"datetime":"2018-11-26 19:00"}],"wind":[{"direction":99.63,"speed":25.65,"datetime":"2018-11-24 20:00"},{"direction":98.09,"speed":24.99,"datetime":"2018-11-24 21:00"},{"direction":103.08,"speed":26.56,"datetime":"2018-11-24 22:00"},{"direction":106.83,"speed":25.88,"datetime":"2018-11-24 23:00"},{"direction":111.44,"speed":24.95,"datetime":"2018-11-25 00:00"},{"direction":115.22,"speed":23.84,"datetime":"2018-11-25 01:00"},{"direction":114.87,"speed":19.91,"datetime":"2018-11-25 02:00"},{"direction":121.42,"speed":20.54,"datetime":"2018-11-25 03:00"},{"direction":124.14,"speed":18.95,"datetime":"2018-11-25 04:00"},{"direction":126.86,"speed":17.33,"datetime":"2018-11-25 05:00"},{"direction":130.15,"speed":15.85,"datetime":"2018-11-25 06:00"},{"direction":132.06,"speed":15.17,"datetime":"2018-11-25 07:00"},{"direction":132.5,"speed":15.88,"datetime":"2018-11-25 08:00"},{"direction":131.54,"speed":16.5,"datetime":"2018-11-25 09:00"},{"direction":129.95,"speed":16.84,"datetime":"2018-11-25 10:00"},{"direction":127.34,"speed":17,"datetime":"2018-11-25 11:00"},{"direction":124.23,"speed":17.52,"datetime":"2018-11-25 12:00"},{"direction":124.76,"speed":18.12,"datetime":"2018-11-25 13:00"},{"direction":127.08,"speed":18.72,"datetime":"2018-11-25 14:00"},{"direction":130.26,"speed":18.08,"datetime":"2018-11-25 15:00"},{"direction":129.9,"speed":15.94,"datetime":"2018-11-25 16:00"},{"direction":128.89,"speed":14.25,"datetime":"2018-11-25 17:00"},{"direction":131.84,"speed":14.81,"datetime":"2018-11-25 18:00"},{"direction":136.02,"speed":14.82,"datetime":"2018-11-25 19:00"},{"direction":136.53,"speed":14.58,"datetime":"2018-11-25 20:00"},{"direction":138.79,"speed":14.03,"datetime":"2018-11-25 21:00"},{"direction":139.26,"speed":13.57,"datetime":"2018-11-25 22:00"},{"direction":140.28,"speed":13.5,"datetime":"2018-11-25 23:00"},{"direction":141.08,"speed":12.72,"datetime":"2018-11-26 00:00"},{"direction":142.7,"speed":11.81,"datetime":"2018-11-26 01:00"},{"direction":142.7,"speed":11.5,"datetime":"2018-11-26 02:00"},{"direction":147.64,"speed":9.24,"datetime":"2018-11-26 03:00"},{"direction":145.46,"speed":8.86,"datetime":"2018-11-26 04:00"},{"direction":150.92,"speed":8.63,"datetime":"2018-11-26 05:00"},{"direction":160.66,"speed":7.74,"datetime":"2018-11-26 06:00"},{"direction":163.12,"speed":6.35,"datetime":"2018-11-26 07:00"},{"direction":150.98,"speed":6.31,"datetime":"2018-11-26 08:00"},{"direction":135.86,"speed":6.55,"datetime":"2018-11-26 09:00"},{"direction":120.28,"speed":6.39,"datetime":"2018-11-26 10:00"},{"direction":98.44,"speed":6.97,"datetime":"2018-11-26 11:00"},{"direction":81.46,"speed":6.9,"datetime":"2018-11-26 12:00"},{"direction":80.35,"speed":8.38,"datetime":"2018-11-26 13:00"},{"direction":59.75,"speed":5.82,"datetime":"2018-11-26 14:00"},{"direction":3.97,"speed":8.45,"datetime":"2018-11-26 15:00"},{"direction":16.04,"speed":9.67,"datetime":"2018-11-26 16:00"},{"direction":34.88,"speed":10.6,"datetime":"2018-11-26 17:00"},{"direction":41.64,"speed":9.96,"datetime":"2018-11-26 18:00"},{"direction":46.29,"speed":10.27,"datetime":"2018-11-26 19:00"}],"temperature":[{"value":20,"datetime":"2018-11-24 20:00"},{"value":20,"datetime":"2018-11-24 21:00"},{"value":19,"datetime":"2018-11-24 22:00"},{"value":19,"datetime":"2018-11-24 23:00"},{"value":19,"datetime":"2018-11-25 00:00"},{"value":20,"datetime":"2018-11-25 01:00"},{"value":20,"datetime":"2018-11-25 02:00"},{"value":20,"datetime":"2018-11-25 03:00"},{"value":19,"datetime":"2018-11-25 04:00"},{"value":19,"datetime":"2018-11-25 05:00"},{"value":20,"datetime":"2018-11-25 06:00"},{"value":20,"datetime":"2018-11-25 07:00"},{"value":21,"datetime":"2018-11-25 08:00"},{"value":23,"datetime":"2018-11-25 09:00"},{"value":24,"datetime":"2018-11-25 10:00"},{"value":24,"datetime":"2018-11-25 11:00"},{"value":25,"datetime":"2018-11-25 12:00"},{"value":25,"datetime":"2018-11-25 13:00"},{"value":25,"datetime":"2018-11-25 14:00"},{"value":24,"datetime":"2018-11-25 15:00"},{"value":24,"datetime":"2018-11-25 16:00"},{"value":23,"datetime":"2018-11-25 17:00"},{"value":23,"datetime":"2018-11-25 18:00"},{"value":21.56,"datetime":"2018-11-25 19:00"},{"value":21.46,"datetime":"2018-11-25 20:00"},{"value":21.27,"datetime":"2018-11-25 21:00"},{"value":21.18,"datetime":"2018-11-25 22:00"},{"value":20.98,"datetime":"2018-11-25 23:00"},{"value":20.95,"datetime":"2018-11-26 00:00"},{"value":20.65,"datetime":"2018-11-26 01:00"},{"value":20.31,"datetime":"2018-11-26 02:00"},{"value":19.94,"datetime":"2018-11-26 03:00"},{"value":19.74,"datetime":"2018-11-26 04:00"},{"value":19.4,"datetime":"2018-11-26 05:00"},{"value":19,"datetime":"2018-11-26 06:00"},{"value":19.46,"datetime":"2018-11-26 07:00"},{"value":20.13,"datetime":"2018-11-26 08:00"},{"value":20.7,"datetime":"2018-11-26 09:00"},{"value":21.33,"datetime":"2018-11-26 10:00"},{"value":22.44,"datetime":"2018-11-26 11:00"},{"value":22.91,"datetime":"2018-11-26 12:00"},{"value":23,"datetime":"2018-11-26 13:00"},{"value":22.78,"datetime":"2018-11-26 14:00"},{"value":22.19,"datetime":"2018-11-26 15:00"},{"value":21.68,"datetime":"2018-11-26 16:00"},{"value":21.33,"datetime":"2018-11-26 17:00"},{"value":21.32,"datetime":"2018-11-26 18:00"},{"value":21.29,"datetime":"2018-11-26 19:00"}]},"forecast_keypoint":"附近正在下雨，出门还是带把伞吧~","minutely":{"status":"ok","description":"附近正在下雨，出门还是带把伞吧~","probability":[0.3466466069,0.3364901543,0.300388515,0.4155747294],"probability_4h":[0.3466466069,0.4155747294,0.2934017777,0.229771018],"datasource":"radar","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},"daily":{"status":"ok","comfort":[{"index":"4","desc":"温暖","datetime":"2018-11-24"},{"index":"4","desc":"温暖","datetime":"2018-11-25"},{"index":"4","desc":"温暖","datetime":"2018-11-26"},{"index":"4","desc":"温暖","datetime":"2018-11-27"},{"index":"4","desc":"温暖","datetime":"2018-11-28"}],"skycon_20h_32h":[{"date":"2018-11-24","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-25","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-26","value":"RAIN"},{"date":"2018-11-27","value":"CLOUDY"},{"date":"2018-11-28","value":"RAIN"}],"temperature":[{"date":"2018-11-24","max":23,"avg":19.5,"min":19},{"date":"2018-11-25","max":25,"avg":21.85,"min":19},{"date":"2018-11-26","max":23,"avg":21.01,"min":19},{"date":"2018-11-27","max":24,"avg":21.42,"min":19},{"date":"2018-11-28","max":22.29,"avg":20.4,"min":18}],"dswrf":[{"date":"2018-11-24","max":424.2,"avg":25.9,"min":0},{"date":"2018-11-25","max":603.8,"avg":198.6,"min":0},{"date":"2018-11-26","max":313.3,"avg":71.9,"min":0},{"date":"2018-11-27","max":308,"avg":86.2,"min":0},{"date":"2018-11-28","max":413,"avg":108.9,"min":0}],"cloudrate":[{"date":"2018-11-24","max":0.86,"avg":0.66,"min":0.41},{"date":"2018-11-25","max":0.92,"avg":0.23,"min":0},{"date":"2018-11-26","max":0.99,"avg":0.84,"min":0.62},{"date":"2018-11-27","max":1,"avg":0.94,"min":0.85},{"date":"2018-11-28","max":1,"avg":0.94,"min":0.79}],"aqi":[{"date":"2018-11-24","max":40,"avg":24,"min":9},{"date":"2018-11-25","max":41,"avg":32.96,"min":26},{"date":"2018-11-26","max":43,"avg":37.79,"min":34},{"date":"2018-11-27","max":33,"avg":22.67,"min":19},{"date":"2018-11-28","max":31,"avg":27.54,"min":24}],"skycon":[{"date":"2018-11-24","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-25","value":"PARTLY_CLOUDY_DAY"},{"date":"2018-11-26","value":"CLOUDY"},{"date":"2018-11-27","value":"RAIN"},{"date":"2018-11-28","value":"CLOUDY"}],"visibility":[{"date":"2018-11-24","max":24.1,"avg":22.3,"min":9.7},{"date":"2018-11-25","max":24.1,"avg":23.8,"min":22.7},{"date":"2018-11-26","max":24,"avg":21,"min":12.2},{"date":"2018-11-27","max":23.4,"avg":19.5,"min":10.8},{"date":"2018-11-28","max":24.1,"avg":21.8,"min":16}],"humidity":[{"date":"2018-11-24","max":0.84,"avg":0.79,"min":0.77},{"date":"2018-11-25","max":0.82,"avg":0.76,"min":0.65},{"date":"2018-11-26","max":0.88,"avg":0.81,"min":0.71},{"date":"2018-11-27","max":0.88,"avg":0.86,"min":0.81},{"date":"2018-11-28","max":0.89,"avg":0.85,"min":0.71}],"astro":[{"date":"2018-11-24","sunset":{"time":"17:03"},"sunrise":{"time":"06:16"}},{"date":"2018-11-25","sunset":{"time":"17:03"},"sunrise":{"time":"06:17"}},{"date":"2018-11-26","sunset":{"time":"17:03"},"sunrise":{"time":"06:17"}},{"date":"2018-11-27","sunset":{"time":"17:03"},"sunrise":{"time":"06:18"}},{"date":"2018-11-28","sunset":{"time":"17:03"},"sunrise":{"time":"06:19"}}],"coldRisk":[{"index":"3","desc":"易发","datetime":"2018-11-24"},{"index":"3","desc":"易发","datetime":"2018-11-25"},{"index":"3","desc":"易发","datetime":"2018-11-26"},{"index":"3","desc":"易发","datetime":"2018-11-27"},{"index":"3","desc":"易发","datetime":"2018-11-28"}],"ultraviolet":[{"index":"2","desc":"弱","datetime":"2018-11-24"},{"index":"4","desc":"强","datetime":"2018-11-25"},{"index":"1","desc":"最弱","datetime":"2018-11-26"},{"index":"1","desc":"最弱","datetime":"2018-11-27"},{"index":"1","desc":"最弱","datetime":"2018-11-28"}],"pres":[{"date":"2018-11-24","max":100599.86,"avg":100587.45,"min":100310.2},{"date":"2018-11-25","max":100550.2,"avg":100333.22,"min":100169.19},{"date":"2018-11-26","max":100550.46,"avg":100359.25,"min":100180.79},{"date":"2018-11-27","max":100569.19,"avg":100419.36,"min":100249.19},{"date":"2018-11-28","max":100580.79,"avg":100319.32,"min":100162.06}],"pm25":[{"date":"2018-11-24","max":16,"avg":14.25,"min":2},{"date":"2018-11-25","max":29,"avg":23.08,"min":18},{"date":"2018-11-26","max":30,"avg":26.38,"min":24},{"date":"2018-11-27","max":23,"avg":15.83,"min":13},{"date":"2018-11-28","max":22,"avg":19.29,"min":17}],"dressing":[{"index":"5","desc":"凉爽","datetime":"2018-11-24"},{"index":"5","desc":"凉爽","datetime":"2018-11-25"},{"index":"4","desc":"温暖","datetime":"2018-11-26"},{"index":"4","desc":"温暖","datetime":"2018-11-27"},{"index":"4","desc":"温暖","datetime":"2018-11-28"}],"carWashing":[{"index":"3","desc":"较不适宜","datetime":"2018-11-24"},{"index":"3","desc":"较不适宜","datetime":"2018-11-25"},{"index":"3","desc":"较不适宜","datetime":"2018-11-26"},{"index":"3","desc":"较不适宜","datetime":"2018-11-27"},{"index":"3","desc":"较不适宜","datetime":"2018-11-28"}],"precipitation":[{"date":"2018-11-24","max":0.1849,"avg":0,"min":0},{"date":"2018-11-25","max":0.0644,"avg":0.0077,"min":0},{"date":"2018-11-26","max":0.2005,"avg":0.0412,"min":0},{"date":"2018-11-27","max":0.2547,"avg":0.1059,"min":0},{"date":"2018-11-28","max":0.1667,"avg":0.0402,"min":0}],"wind":[{"date":"2018-11-24","max":{"direction":103.08,"speed":26.56},"avg":{"direction":95.09,"speed":22.15},"min":{"direction":81.66,"speed":19.59}},{"date":"2018-11-25","max":{"direction":111.44,"speed":24.95},"avg":{"direction":127.4,"speed":17.11},"min":{"direction":140.28,"speed":13.5}},{"date":"2018-11-26","max":{"direction":141.08,"speed":12.72},"avg":{"direction":93.2,"speed":8.92},"min":{"direction":59.75,"speed":5.82}},{"date":"2018-11-27","max":{"direction":74.3,"speed":15.94},"avg":{"direction":62.7,"speed":11.71},"min":{"direction":51.22,"speed":7.31}},{"date":"2018-11-28","max":{"direction":339.74,"speed":18.07},"avg":{"direction":0.87,"speed":11.09},"min":{"direction":232.42,"speed":6.81}}],"skycon_08h_20h":[{"date":"2018-11-24","value":"RAIN"},{"date":"2018-11-25","value":"CLEAR_DAY"},{"date":"2018-11-26","value":"CLOUDY"},{"date":"2018-11-27","value":"RAIN"},{"date":"2018-11-28","value":"CLOUDY"}]},"primary":0}
     * server_time : 1543061607
     * api_status : active
     * tzshift : 28800
     * api_version : v2.2
     * unit : metric
     * location : [25.1552,121.6544]
     */

    private String status;
    private String lang;
    private ResultBean result;
    private double server_time;
    private String api_status;
    private double tzshift;
    private String api_version;
    private String unit;
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public double getServer_time() {
        return server_time;
    }

    public void setServer_time(double server_time) {
        this.server_time = server_time;
    }

    public String getApi_status() {
        return api_status;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public double getTzshift() {
        return tzshift;
    }

    public void setTzshift(double tzshift) {
        this.tzshift = tzshift;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public static class ResultBean {
        /**
         * hourly : {"status":"ok","description":"多云，云渐少，明天凌晨3点钟后转至晴","skycon":[{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 20:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 21:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 22:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 23:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 00:00"},{"value":"RAIN","datetime":"2018-11-25 01:00"},{"value":"RAIN","datetime":"2018-11-25 02:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 03:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 04:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 05:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 06:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 07:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 08:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 09:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 10:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 11:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 12:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 13:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 14:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 15:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 16:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 17:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 18:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 19:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 20:00"},{"value":"CLOUDY","datetime":"2018-11-25 21:00"},{"value":"CLOUDY","datetime":"2018-11-25 22:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 23:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 00:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 01:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 02:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 03:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 04:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 05:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 06:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2018-11-26 07:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2018-11-26 08:00"},{"value":"CLOUDY","datetime":"2018-11-26 09:00"},{"value":"CLOUDY","datetime":"2018-11-26 10:00"},{"value":"CLOUDY","datetime":"2018-11-26 11:00"},{"value":"CLOUDY","datetime":"2018-11-26 12:00"},{"value":"CLOUDY","datetime":"2018-11-26 13:00"},{"value":"CLOUDY","datetime":"2018-11-26 14:00"},{"value":"RAIN","datetime":"2018-11-26 15:00"},{"value":"RAIN","datetime":"2018-11-26 16:00"},{"value":"RAIN","datetime":"2018-11-26 17:00"},{"value":"RAIN","datetime":"2018-11-26 18:00"},{"value":"RAIN","datetime":"2018-11-26 19:00"}],"cloudrate":[{"value":0.58,"datetime":"2018-11-24 20:00"},{"value":0.61,"datetime":"2018-11-24 21:00"},{"value":0.77,"datetime":"2018-11-24 22:00"},{"value":0.67,"datetime":"2018-11-24 23:00"},{"value":0.6,"datetime":"2018-11-25 00:00"},{"value":0.53,"datetime":"2018-11-25 01:00"},{"value":0.41,"datetime":"2018-11-25 02:00"},{"value":0.02,"datetime":"2018-11-25 03:00"},{"value":0.01,"datetime":"2018-11-25 04:00"},{"value":0.01,"datetime":"2018-11-25 05:00"},{"value":0.01,"datetime":"2018-11-25 06:00"},{"value":0,"datetime":"2018-11-25 07:00"},{"value":0,"datetime":"2018-11-25 08:00"},{"value":0.14,"datetime":"2018-11-25 09:00"},{"value":0.07,"datetime":"2018-11-25 10:00"},{"value":0.05,"datetime":"2018-11-25 11:00"},{"value":0.04,"datetime":"2018-11-25 12:00"},{"value":0.03,"datetime":"2018-11-25 13:00"},{"value":0.03,"datetime":"2018-11-25 14:00"},{"value":0,"datetime":"2018-11-25 15:00"},{"value":0,"datetime":"2018-11-25 16:00"},{"value":0.1,"datetime":"2018-11-25 17:00"},{"value":0.26,"datetime":"2018-11-25 18:00"},{"value":0.35,"datetime":"2018-11-25 19:00"},{"value":0.42,"datetime":"2018-11-25 20:00"},{"value":0.92,"datetime":"2018-11-25 21:00"},{"value":0.81,"datetime":"2018-11-25 22:00"},{"value":0.69,"datetime":"2018-11-25 23:00"},{"value":0.66,"datetime":"2018-11-26 00:00"},{"value":0.67,"datetime":"2018-11-26 01:00"},{"value":0.67,"datetime":"2018-11-26 02:00"},{"value":0.62,"datetime":"2018-11-26 03:00"},{"value":0.72,"datetime":"2018-11-26 04:00"},{"value":0.69,"datetime":"2018-11-26 05:00"},{"value":0.68,"datetime":"2018-11-26 06:00"},{"value":0.71,"datetime":"2018-11-26 07:00"},{"value":0.73,"datetime":"2018-11-26 08:00"},{"value":0.98,"datetime":"2018-11-26 09:00"},{"value":0.89,"datetime":"2018-11-26 10:00"},{"value":0.85,"datetime":"2018-11-26 11:00"},{"value":0.85,"datetime":"2018-11-26 12:00"},{"value":0.85,"datetime":"2018-11-26 13:00"},{"value":0.85,"datetime":"2018-11-26 14:00"},{"value":0.96,"datetime":"2018-11-26 15:00"},{"value":0.97,"datetime":"2018-11-26 16:00"},{"value":0.97,"datetime":"2018-11-26 17:00"},{"value":0.96,"datetime":"2018-11-26 18:00"},{"value":0.96,"datetime":"2018-11-26 19:00"}],"aqi":[{"value":32,"datetime":"2018-11-24 20:00"},{"value":20,"datetime":"2018-11-24 21:00"},{"value":21,"datetime":"2018-11-24 22:00"},{"value":23,"datetime":"2018-11-24 23:00"},{"value":26,"datetime":"2018-11-25 00:00"},{"value":27,"datetime":"2018-11-25 01:00"},{"value":27,"datetime":"2018-11-25 02:00"},{"value":29,"datetime":"2018-11-25 03:00"},{"value":30,"datetime":"2018-11-25 04:00"},{"value":30,"datetime":"2018-11-25 05:00"},{"value":31,"datetime":"2018-11-25 06:00"},{"value":31,"datetime":"2018-11-25 07:00"},{"value":31,"datetime":"2018-11-25 08:00"},{"value":31,"datetime":"2018-11-25 09:00"},{"value":33,"datetime":"2018-11-25 10:00"},{"value":33,"datetime":"2018-11-25 11:00"},{"value":33,"datetime":"2018-11-25 12:00"},{"value":33,"datetime":"2018-11-25 13:00"},{"value":33,"datetime":"2018-11-25 14:00"},{"value":33,"datetime":"2018-11-25 15:00"},{"value":33,"datetime":"2018-11-25 16:00"},{"value":34,"datetime":"2018-11-25 17:00"},{"value":36,"datetime":"2018-11-25 18:00"},{"value":37,"datetime":"2018-11-25 19:00"},{"value":39,"datetime":"2018-11-25 20:00"},{"value":40,"datetime":"2018-11-25 21:00"},{"value":40,"datetime":"2018-11-25 22:00"},{"value":41,"datetime":"2018-11-25 23:00"},{"value":43,"datetime":"2018-11-26 00:00"},{"value":43,"datetime":"2018-11-26 01:00"},{"value":43,"datetime":"2018-11-26 02:00"},{"value":41,"datetime":"2018-11-26 03:00"},{"value":40,"datetime":"2018-11-26 04:00"},{"value":39,"datetime":"2018-11-26 05:00"},{"value":37,"datetime":"2018-11-26 06:00"},{"value":37,"datetime":"2018-11-26 07:00"},{"value":37,"datetime":"2018-11-26 08:00"},{"value":36,"datetime":"2018-11-26 09:00"},{"value":36,"datetime":"2018-11-26 10:00"},{"value":36,"datetime":"2018-11-26 11:00"},{"value":36,"datetime":"2018-11-26 12:00"},{"value":36,"datetime":"2018-11-26 13:00"},{"value":36,"datetime":"2018-11-26 14:00"},{"value":36,"datetime":"2018-11-26 15:00"},{"value":37,"datetime":"2018-11-26 16:00"},{"value":37,"datetime":"2018-11-26 17:00"},{"value":39,"datetime":"2018-11-26 18:00"},{"value":39,"datetime":"2018-11-26 19:00"}],"dswrf":[{"value":103.6064256,"datetime":"2018-11-24 20:00"},{"value":0,"datetime":"2018-11-24 21:00"},{"value":0,"datetime":"2018-11-24 22:00"},{"value":0,"datetime":"2018-11-24 23:00"},{"value":0,"datetime":"2018-11-25 00:00"},{"value":0,"datetime":"2018-11-25 01:00"},{"value":0,"datetime":"2018-11-25 02:00"},{"value":0,"datetime":"2018-11-25 03:00"},{"value":0,"datetime":"2018-11-25 04:00"},{"value":0,"datetime":"2018-11-25 05:00"},{"value":0,"datetime":"2018-11-25 06:00"},{"value":7.6260608,"datetime":"2018-11-25 07:00"},{"value":36.52521216,"datetime":"2018-11-25 08:00"},{"value":390,"datetime":"2018-11-25 09:00"},{"value":473.792,"datetime":"2018-11-25 10:00"},{"value":537.6260608,"datetime":"2018-11-25 11:00"},{"value":581.4500608,"datetime":"2018-11-25 12:00"},{"value":603.792,"datetime":"2018-11-25 13:00"},{"value":603.792,"datetime":"2018-11-25 14:00"},{"value":450,"datetime":"2018-11-25 15:00"},{"value":355.2841216,"datetime":"2018-11-25 16:00"},{"value":257.6260608,"datetime":"2018-11-25 17:00"},{"value":190,"datetime":"2018-11-25 18:00"},{"value":151.4500608,"datetime":"2018-11-25 19:00"},{"value":128.43282432,"datetime":"2018-11-25 20:00"},{"value":0,"datetime":"2018-11-25 21:00"},{"value":0,"datetime":"2018-11-25 22:00"},{"value":0,"datetime":"2018-11-25 23:00"},{"value":0,"datetime":"2018-11-26 00:00"},{"value":0,"datetime":"2018-11-26 01:00"},{"value":0,"datetime":"2018-11-26 02:00"},{"value":0,"datetime":"2018-11-26 03:00"},{"value":0,"datetime":"2018-11-26 04:00"},{"value":0,"datetime":"2018-11-26 05:00"},{"value":0,"datetime":"2018-11-26 06:00"},{"value":0,"datetime":"2018-11-26 07:00"},{"value":11.31602432,"datetime":"2018-11-26 08:00"},{"value":73.9844864,"datetime":"2018-11-26 09:00"},{"value":157.8135808,"datetime":"2018-11-26 10:00"},{"value":241.3560064,"datetime":"2018-11-26 11:00"},{"value":289.5503104,"datetime":"2018-11-26 12:00"},{"value":313.2783104,"datetime":"2018-11-26 13:00"},{"value":305.6202496,"datetime":"2018-11-26 14:00"},{"value":103.972608,"datetime":"2018-11-26 15:00"},{"value":72.5124864,"datetime":"2018-11-26 16:00"},{"value":53.4363648,"datetime":"2018-11-26 17:00"},{"value":41.986304,"datetime":"2018-11-26 18:00"},{"value":34.3602432,"datetime":"2018-11-26 19:00"}],"visibility":[{"value":23.28,"datetime":"2018-11-24 20:00"},{"value":21.88,"datetime":"2018-11-24 21:00"},{"value":21.91,"datetime":"2018-11-24 22:00"},{"value":22.29,"datetime":"2018-11-24 23:00"},{"value":22.71,"datetime":"2018-11-25 00:00"},{"value":23.3,"datetime":"2018-11-25 01:00"},{"value":23.47,"datetime":"2018-11-25 02:00"},{"value":24.1,"datetime":"2018-11-25 03:00"},{"value":24.1,"datetime":"2018-11-25 04:00"},{"value":24.1,"datetime":"2018-11-25 05:00"},{"value":24.1,"datetime":"2018-11-25 06:00"},{"value":24.1,"datetime":"2018-11-25 07:00"},{"value":24.1,"datetime":"2018-11-25 08:00"},{"value":24.1,"datetime":"2018-11-25 09:00"},{"value":24.1,"datetime":"2018-11-25 10:00"},{"value":24.1,"datetime":"2018-11-25 11:00"},{"value":24.1,"datetime":"2018-11-25 12:00"},{"value":24.1,"datetime":"2018-11-25 13:00"},{"value":24.1,"datetime":"2018-11-25 14:00"},{"value":24.1,"datetime":"2018-11-25 15:00"},{"value":24.1,"datetime":"2018-11-25 16:00"},{"value":23.17,"datetime":"2018-11-25 17:00"},{"value":23.33,"datetime":"2018-11-25 18:00"},{"value":23.53,"datetime":"2018-11-25 19:00"},{"value":23.47,"datetime":"2018-11-25 20:00"},{"value":23.45,"datetime":"2018-11-25 21:00"},{"value":23.45,"datetime":"2018-11-25 22:00"},{"value":23.43,"datetime":"2018-11-25 23:00"},{"value":23.55,"datetime":"2018-11-26 00:00"},{"value":23.88,"datetime":"2018-11-26 01:00"},{"value":23.95,"datetime":"2018-11-26 02:00"},{"value":23.94,"datetime":"2018-11-26 03:00"},{"value":23.52,"datetime":"2018-11-26 04:00"},{"value":23.18,"datetime":"2018-11-26 05:00"},{"value":23.13,"datetime":"2018-11-26 06:00"},{"value":23.37,"datetime":"2018-11-26 07:00"},{"value":23.45,"datetime":"2018-11-26 08:00"},{"value":23.27,"datetime":"2018-11-26 09:00"},{"value":23.79,"datetime":"2018-11-26 10:00"},{"value":23.61,"datetime":"2018-11-26 11:00"},{"value":23.78,"datetime":"2018-11-26 12:00"},{"value":20.3,"datetime":"2018-11-26 13:00"},{"value":23.09,"datetime":"2018-11-26 14:00"},{"value":21.1,"datetime":"2018-11-26 15:00"},{"value":22.08,"datetime":"2018-11-26 16:00"},{"value":18.97,"datetime":"2018-11-26 17:00"},{"value":21.92,"datetime":"2018-11-26 18:00"},{"value":14.85,"datetime":"2018-11-26 19:00"}],"humidity":[{"value":0.8,"datetime":"2018-11-24 20:00"},{"value":0.8,"datetime":"2018-11-24 21:00"},{"value":0.78,"datetime":"2018-11-24 22:00"},{"value":0.77,"datetime":"2018-11-24 23:00"},{"value":0.78,"datetime":"2018-11-25 00:00"},{"value":0.78,"datetime":"2018-11-25 01:00"},{"value":0.81,"datetime":"2018-11-25 02:00"},{"value":0.8,"datetime":"2018-11-25 03:00"},{"value":0.81,"datetime":"2018-11-25 04:00"},{"value":0.82,"datetime":"2018-11-25 05:00"},{"value":0.82,"datetime":"2018-11-25 06:00"},{"value":0.82,"datetime":"2018-11-25 07:00"},{"value":0.77,"datetime":"2018-11-25 08:00"},{"value":0.73,"datetime":"2018-11-25 09:00"},{"value":0.69,"datetime":"2018-11-25 10:00"},{"value":0.67,"datetime":"2018-11-25 11:00"},{"value":0.65,"datetime":"2018-11-25 12:00"},{"value":0.65,"datetime":"2018-11-25 13:00"},{"value":0.66,"datetime":"2018-11-25 14:00"},{"value":0.67,"datetime":"2018-11-25 15:00"},{"value":0.7,"datetime":"2018-11-25 16:00"},{"value":0.75,"datetime":"2018-11-25 17:00"},{"value":0.77,"datetime":"2018-11-25 18:00"},{"value":0.78,"datetime":"2018-11-25 19:00"},{"value":0.79,"datetime":"2018-11-25 20:00"},{"value":0.8,"datetime":"2018-11-25 21:00"},{"value":0.81,"datetime":"2018-11-25 22:00"},{"value":0.82,"datetime":"2018-11-25 23:00"},{"value":0.82,"datetime":"2018-11-26 00:00"},{"value":0.82,"datetime":"2018-11-26 01:00"},{"value":0.82,"datetime":"2018-11-26 02:00"},{"value":0.81,"datetime":"2018-11-26 03:00"},{"value":0.8,"datetime":"2018-11-26 04:00"},{"value":0.8,"datetime":"2018-11-26 05:00"},{"value":0.8,"datetime":"2018-11-26 06:00"},{"value":0.79,"datetime":"2018-11-26 07:00"},{"value":0.77,"datetime":"2018-11-26 08:00"},{"value":0.78,"datetime":"2018-11-26 09:00"},{"value":0.75,"datetime":"2018-11-26 10:00"},{"value":0.72,"datetime":"2018-11-26 11:00"},{"value":0.71,"datetime":"2018-11-26 12:00"},{"value":0.71,"datetime":"2018-11-26 13:00"},{"value":0.74,"datetime":"2018-11-26 14:00"},{"value":0.79,"datetime":"2018-11-26 15:00"},{"value":0.83,"datetime":"2018-11-26 16:00"},{"value":0.85,"datetime":"2018-11-26 17:00"},{"value":0.86,"datetime":"2018-11-26 18:00"},{"value":0.87,"datetime":"2018-11-26 19:00"}],"pres":[{"value":100550.2003200001,"datetime":"2018-11-24 20:00"},{"value":100599.8643200001,"datetime":"2018-11-24 21:00"},{"value":100599.8643200001,"datetime":"2018-11-24 22:00"},{"value":100599.8643200001,"datetime":"2018-11-24 23:00"},{"value":100550.20032,"datetime":"2018-11-25 00:00"},{"value":100470.2003200001,"datetime":"2018-11-25 01:00"},{"value":100439.8643200001,"datetime":"2018-11-25 02:00"},{"value":100390.2003200001,"datetime":"2018-11-25 03:00"},{"value":100359.8643200001,"datetime":"2018-11-25 04:00"},{"value":100371.4648064001,"datetime":"2018-11-25 05:00"},{"value":100390.2003200001,"datetime":"2018-11-25 06:00"},{"value":100390.2003200001,"datetime":"2018-11-25 07:00"},{"value":100390.2003200001,"datetime":"2018-11-25 08:00"},{"value":100409.1918336001,"datetime":"2018-11-25 09:00"},{"value":100409.1918336001,"datetime":"2018-11-25 10:00"},{"value":100390.2003200001,"datetime":"2018-11-25 11:00"},{"value":100310.2003200001,"datetime":"2018-11-25 12:00"},{"value":100230.2003200001,"datetime":"2018-11-25 13:00"},{"value":100169.1918336001,"datetime":"2018-11-25 14:00"},{"value":100169.1918336001,"datetime":"2018-11-25 15:00"},{"value":100169.1918336001,"datetime":"2018-11-25 16:00"},{"value":100230.2003200001,"datetime":"2018-11-25 17:00"},{"value":100230.2003200001,"datetime":"2018-11-25 18:00"},{"value":100249.1918336001,"datetime":"2018-11-25 19:00"},{"value":100310.20032,"datetime":"2018-11-25 20:00"},{"value":100329.1918336001,"datetime":"2018-11-25 21:00"},{"value":100329.1918336001,"datetime":"2018-11-25 22:00"},{"value":100310.2003200001,"datetime":"2018-11-25 23:00"},{"value":100310.20032,"datetime":"2018-11-26 00:00"},{"value":100260.7923200001,"datetime":"2018-11-26 01:00"},{"value":100211.4648064001,"datetime":"2018-11-26 02:00"},{"value":100180.7923200001,"datetime":"2018-11-26 03:00"},{"value":100180.7923200001,"datetime":"2018-11-26 04:00"},{"value":100180.7923200001,"datetime":"2018-11-26 05:00"},{"value":100260.79232,"datetime":"2018-11-26 06:00"},{"value":100390.4563200001,"datetime":"2018-11-26 07:00"},{"value":100420.7923200001,"datetime":"2018-11-26 08:00"},{"value":100489.1918336001,"datetime":"2018-11-26 09:00"},{"value":100470.4563200001,"datetime":"2018-11-26 10:00"},{"value":100409.1918336001,"datetime":"2018-11-26 11:00"},{"value":100390.4563200001,"datetime":"2018-11-26 12:00"},{"value":100291.4648064001,"datetime":"2018-11-26 13:00"},{"value":100230.4563200001,"datetime":"2018-11-26 14:00"},{"value":100310.4563200001,"datetime":"2018-11-26 15:00"},{"value":100260.7923200001,"datetime":"2018-11-26 16:00"},{"value":100310.4563200001,"datetime":"2018-11-26 17:00"},{"value":100420.7923200001,"datetime":"2018-11-26 18:00"},{"value":100489.1918336001,"datetime":"2018-11-26 19:00"}],"pm25":[{"value":12,"datetime":"2018-11-24 20:00"},{"value":14,"datetime":"2018-11-24 21:00"},{"value":15,"datetime":"2018-11-24 22:00"},{"value":16,"datetime":"2018-11-24 23:00"},{"value":18,"datetime":"2018-11-25 00:00"},{"value":19,"datetime":"2018-11-25 01:00"},{"value":19,"datetime":"2018-11-25 02:00"},{"value":20,"datetime":"2018-11-25 03:00"},{"value":21,"datetime":"2018-11-25 04:00"},{"value":21,"datetime":"2018-11-25 05:00"},{"value":22,"datetime":"2018-11-25 06:00"},{"value":22,"datetime":"2018-11-25 07:00"},{"value":22,"datetime":"2018-11-25 08:00"},{"value":22,"datetime":"2018-11-25 09:00"},{"value":23,"datetime":"2018-11-25 10:00"},{"value":23,"datetime":"2018-11-25 11:00"},{"value":23,"datetime":"2018-11-25 12:00"},{"value":23,"datetime":"2018-11-25 13:00"},{"value":23,"datetime":"2018-11-25 14:00"},{"value":23,"datetime":"2018-11-25 15:00"},{"value":23,"datetime":"2018-11-25 16:00"},{"value":24,"datetime":"2018-11-25 17:00"},{"value":25,"datetime":"2018-11-25 18:00"},{"value":26,"datetime":"2018-11-25 19:00"},{"value":27,"datetime":"2018-11-25 20:00"},{"value":28,"datetime":"2018-11-25 21:00"},{"value":28,"datetime":"2018-11-25 22:00"},{"value":29,"datetime":"2018-11-25 23:00"},{"value":30,"datetime":"2018-11-26 00:00"},{"value":30,"datetime":"2018-11-26 01:00"},{"value":30,"datetime":"2018-11-26 02:00"},{"value":29,"datetime":"2018-11-26 03:00"},{"value":28,"datetime":"2018-11-26 04:00"},{"value":27,"datetime":"2018-11-26 05:00"},{"value":26,"datetime":"2018-11-26 06:00"},{"value":26,"datetime":"2018-11-26 07:00"},{"value":26,"datetime":"2018-11-26 08:00"},{"value":25,"datetime":"2018-11-26 09:00"},{"value":25,"datetime":"2018-11-26 10:00"},{"value":25,"datetime":"2018-11-26 11:00"},{"value":25,"datetime":"2018-11-26 12:00"},{"value":25,"datetime":"2018-11-26 13:00"},{"value":25,"datetime":"2018-11-26 14:00"},{"value":25,"datetime":"2018-11-26 15:00"},{"value":26,"datetime":"2018-11-26 16:00"},{"value":26,"datetime":"2018-11-26 17:00"},{"value":27,"datetime":"2018-11-26 18:00"},{"value":27,"datetime":"2018-11-26 19:00"}],"precipitation":[{"value":0,"datetime":"2018-11-24 20:00"},{"value":0,"datetime":"2018-11-24 21:00"},{"value":0,"datetime":"2018-11-24 22:00"},{"value":0,"datetime":"2018-11-24 23:00"},{"value":0.057,"datetime":"2018-11-25 00:00"},{"value":0.0644,"datetime":"2018-11-25 01:00"},{"value":0.0644,"datetime":"2018-11-25 02:00"},{"value":0,"datetime":"2018-11-25 03:00"},{"value":0,"datetime":"2018-11-25 04:00"},{"value":0,"datetime":"2018-11-25 05:00"},{"value":0,"datetime":"2018-11-25 06:00"},{"value":0,"datetime":"2018-11-25 07:00"},{"value":0,"datetime":"2018-11-25 08:00"},{"value":0,"datetime":"2018-11-25 09:00"},{"value":0,"datetime":"2018-11-25 10:00"},{"value":0,"datetime":"2018-11-25 11:00"},{"value":0,"datetime":"2018-11-25 12:00"},{"value":0,"datetime":"2018-11-25 13:00"},{"value":0,"datetime":"2018-11-25 14:00"},{"value":0,"datetime":"2018-11-25 15:00"},{"value":0,"datetime":"2018-11-25 16:00"},{"value":0,"datetime":"2018-11-25 17:00"},{"value":0,"datetime":"2018-11-25 18:00"},{"value":0,"datetime":"2018-11-25 19:00"},{"value":0,"datetime":"2018-11-25 20:00"},{"value":0,"datetime":"2018-11-25 21:00"},{"value":0,"datetime":"2018-11-25 22:00"},{"value":0,"datetime":"2018-11-25 23:00"},{"value":0,"datetime":"2018-11-26 00:00"},{"value":0,"datetime":"2018-11-26 01:00"},{"value":0,"datetime":"2018-11-26 02:00"},{"value":0,"datetime":"2018-11-26 03:00"},{"value":0,"datetime":"2018-11-26 04:00"},{"value":0,"datetime":"2018-11-26 05:00"},{"value":0,"datetime":"2018-11-26 06:00"},{"value":0,"datetime":"2018-11-26 07:00"},{"value":0,"datetime":"2018-11-26 08:00"},{"value":0,"datetime":"2018-11-26 09:00"},{"value":0,"datetime":"2018-11-26 10:00"},{"value":0,"datetime":"2018-11-26 11:00"},{"value":0,"datetime":"2018-11-26 12:00"},{"value":0,"datetime":"2018-11-26 13:00"},{"value":0,"datetime":"2018-11-26 14:00"},{"value":0.1437,"datetime":"2018-11-26 15:00"},{"value":0.1127,"datetime":"2018-11-26 16:00"},{"value":0.0817,"datetime":"2018-11-26 17:00"},{"value":0.0796,"datetime":"2018-11-26 18:00"},{"value":0.0725,"datetime":"2018-11-26 19:00"}],"wind":[{"direction":99.63,"speed":25.65,"datetime":"2018-11-24 20:00"},{"direction":98.09,"speed":24.99,"datetime":"2018-11-24 21:00"},{"direction":103.08,"speed":26.56,"datetime":"2018-11-24 22:00"},{"direction":106.83,"speed":25.88,"datetime":"2018-11-24 23:00"},{"direction":111.44,"speed":24.95,"datetime":"2018-11-25 00:00"},{"direction":115.22,"speed":23.84,"datetime":"2018-11-25 01:00"},{"direction":114.87,"speed":19.91,"datetime":"2018-11-25 02:00"},{"direction":121.42,"speed":20.54,"datetime":"2018-11-25 03:00"},{"direction":124.14,"speed":18.95,"datetime":"2018-11-25 04:00"},{"direction":126.86,"speed":17.33,"datetime":"2018-11-25 05:00"},{"direction":130.15,"speed":15.85,"datetime":"2018-11-25 06:00"},{"direction":132.06,"speed":15.17,"datetime":"2018-11-25 07:00"},{"direction":132.5,"speed":15.88,"datetime":"2018-11-25 08:00"},{"direction":131.54,"speed":16.5,"datetime":"2018-11-25 09:00"},{"direction":129.95,"speed":16.84,"datetime":"2018-11-25 10:00"},{"direction":127.34,"speed":17,"datetime":"2018-11-25 11:00"},{"direction":124.23,"speed":17.52,"datetime":"2018-11-25 12:00"},{"direction":124.76,"speed":18.12,"datetime":"2018-11-25 13:00"},{"direction":127.08,"speed":18.72,"datetime":"2018-11-25 14:00"},{"direction":130.26,"speed":18.08,"datetime":"2018-11-25 15:00"},{"direction":129.9,"speed":15.94,"datetime":"2018-11-25 16:00"},{"direction":128.89,"speed":14.25,"datetime":"2018-11-25 17:00"},{"direction":131.84,"speed":14.81,"datetime":"2018-11-25 18:00"},{"direction":136.02,"speed":14.82,"datetime":"2018-11-25 19:00"},{"direction":136.53,"speed":14.58,"datetime":"2018-11-25 20:00"},{"direction":138.79,"speed":14.03,"datetime":"2018-11-25 21:00"},{"direction":139.26,"speed":13.57,"datetime":"2018-11-25 22:00"},{"direction":140.28,"speed":13.5,"datetime":"2018-11-25 23:00"},{"direction":141.08,"speed":12.72,"datetime":"2018-11-26 00:00"},{"direction":142.7,"speed":11.81,"datetime":"2018-11-26 01:00"},{"direction":142.7,"speed":11.5,"datetime":"2018-11-26 02:00"},{"direction":147.64,"speed":9.24,"datetime":"2018-11-26 03:00"},{"direction":145.46,"speed":8.86,"datetime":"2018-11-26 04:00"},{"direction":150.92,"speed":8.63,"datetime":"2018-11-26 05:00"},{"direction":160.66,"speed":7.74,"datetime":"2018-11-26 06:00"},{"direction":163.12,"speed":6.35,"datetime":"2018-11-26 07:00"},{"direction":150.98,"speed":6.31,"datetime":"2018-11-26 08:00"},{"direction":135.86,"speed":6.55,"datetime":"2018-11-26 09:00"},{"direction":120.28,"speed":6.39,"datetime":"2018-11-26 10:00"},{"direction":98.44,"speed":6.97,"datetime":"2018-11-26 11:00"},{"direction":81.46,"speed":6.9,"datetime":"2018-11-26 12:00"},{"direction":80.35,"speed":8.38,"datetime":"2018-11-26 13:00"},{"direction":59.75,"speed":5.82,"datetime":"2018-11-26 14:00"},{"direction":3.97,"speed":8.45,"datetime":"2018-11-26 15:00"},{"direction":16.04,"speed":9.67,"datetime":"2018-11-26 16:00"},{"direction":34.88,"speed":10.6,"datetime":"2018-11-26 17:00"},{"direction":41.64,"speed":9.96,"datetime":"2018-11-26 18:00"},{"direction":46.29,"speed":10.27,"datetime":"2018-11-26 19:00"}],"temperature":[{"value":20,"datetime":"2018-11-24 20:00"},{"value":20,"datetime":"2018-11-24 21:00"},{"value":19,"datetime":"2018-11-24 22:00"},{"value":19,"datetime":"2018-11-24 23:00"},{"value":19,"datetime":"2018-11-25 00:00"},{"value":20,"datetime":"2018-11-25 01:00"},{"value":20,"datetime":"2018-11-25 02:00"},{"value":20,"datetime":"2018-11-25 03:00"},{"value":19,"datetime":"2018-11-25 04:00"},{"value":19,"datetime":"2018-11-25 05:00"},{"value":20,"datetime":"2018-11-25 06:00"},{"value":20,"datetime":"2018-11-25 07:00"},{"value":21,"datetime":"2018-11-25 08:00"},{"value":23,"datetime":"2018-11-25 09:00"},{"value":24,"datetime":"2018-11-25 10:00"},{"value":24,"datetime":"2018-11-25 11:00"},{"value":25,"datetime":"2018-11-25 12:00"},{"value":25,"datetime":"2018-11-25 13:00"},{"value":25,"datetime":"2018-11-25 14:00"},{"value":24,"datetime":"2018-11-25 15:00"},{"value":24,"datetime":"2018-11-25 16:00"},{"value":23,"datetime":"2018-11-25 17:00"},{"value":23,"datetime":"2018-11-25 18:00"},{"value":21.56,"datetime":"2018-11-25 19:00"},{"value":21.46,"datetime":"2018-11-25 20:00"},{"value":21.27,"datetime":"2018-11-25 21:00"},{"value":21.18,"datetime":"2018-11-25 22:00"},{"value":20.98,"datetime":"2018-11-25 23:00"},{"value":20.95,"datetime":"2018-11-26 00:00"},{"value":20.65,"datetime":"2018-11-26 01:00"},{"value":20.31,"datetime":"2018-11-26 02:00"},{"value":19.94,"datetime":"2018-11-26 03:00"},{"value":19.74,"datetime":"2018-11-26 04:00"},{"value":19.4,"datetime":"2018-11-26 05:00"},{"value":19,"datetime":"2018-11-26 06:00"},{"value":19.46,"datetime":"2018-11-26 07:00"},{"value":20.13,"datetime":"2018-11-26 08:00"},{"value":20.7,"datetime":"2018-11-26 09:00"},{"value":21.33,"datetime":"2018-11-26 10:00"},{"value":22.44,"datetime":"2018-11-26 11:00"},{"value":22.91,"datetime":"2018-11-26 12:00"},{"value":23,"datetime":"2018-11-26 13:00"},{"value":22.78,"datetime":"2018-11-26 14:00"},{"value":22.19,"datetime":"2018-11-26 15:00"},{"value":21.68,"datetime":"2018-11-26 16:00"},{"value":21.33,"datetime":"2018-11-26 17:00"},{"value":21.32,"datetime":"2018-11-26 18:00"},{"value":21.29,"datetime":"2018-11-26 19:00"}]}
         * forecast_keypoint : 附近正在下雨，出门还是带把伞吧~
         * minutely : {"status":"ok","description":"附近正在下雨，出门还是带把伞吧~","probability":[0.3466466069,0.3364901543,0.300388515,0.4155747294],"probability_4h":[0.3466466069,0.4155747294,0.2934017777,0.229771018],"datasource":"radar","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}
         * daily : {"status":"ok","comfort":[{"index":"4","desc":"温暖","datetime":"2018-11-24"},{"index":"4","desc":"温暖","datetime":"2018-11-25"},{"index":"4","desc":"温暖","datetime":"2018-11-26"},{"index":"4","desc":"温暖","datetime":"2018-11-27"},{"index":"4","desc":"温暖","datetime":"2018-11-28"}],"skycon_20h_32h":[{"date":"2018-11-24","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-25","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-26","value":"RAIN"},{"date":"2018-11-27","value":"CLOUDY"},{"date":"2018-11-28","value":"RAIN"}],"temperature":[{"date":"2018-11-24","max":23,"avg":19.5,"min":19},{"date":"2018-11-25","max":25,"avg":21.85,"min":19},{"date":"2018-11-26","max":23,"avg":21.01,"min":19},{"date":"2018-11-27","max":24,"avg":21.42,"min":19},{"date":"2018-11-28","max":22.29,"avg":20.4,"min":18}],"dswrf":[{"date":"2018-11-24","max":424.2,"avg":25.9,"min":0},{"date":"2018-11-25","max":603.8,"avg":198.6,"min":0},{"date":"2018-11-26","max":313.3,"avg":71.9,"min":0},{"date":"2018-11-27","max":308,"avg":86.2,"min":0},{"date":"2018-11-28","max":413,"avg":108.9,"min":0}],"cloudrate":[{"date":"2018-11-24","max":0.86,"avg":0.66,"min":0.41},{"date":"2018-11-25","max":0.92,"avg":0.23,"min":0},{"date":"2018-11-26","max":0.99,"avg":0.84,"min":0.62},{"date":"2018-11-27","max":1,"avg":0.94,"min":0.85},{"date":"2018-11-28","max":1,"avg":0.94,"min":0.79}],"aqi":[{"date":"2018-11-24","max":40,"avg":24,"min":9},{"date":"2018-11-25","max":41,"avg":32.96,"min":26},{"date":"2018-11-26","max":43,"avg":37.79,"min":34},{"date":"2018-11-27","max":33,"avg":22.67,"min":19},{"date":"2018-11-28","max":31,"avg":27.54,"min":24}],"skycon":[{"date":"2018-11-24","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-25","value":"PARTLY_CLOUDY_DAY"},{"date":"2018-11-26","value":"CLOUDY"},{"date":"2018-11-27","value":"RAIN"},{"date":"2018-11-28","value":"CLOUDY"}],"visibility":[{"date":"2018-11-24","max":24.1,"avg":22.3,"min":9.7},{"date":"2018-11-25","max":24.1,"avg":23.8,"min":22.7},{"date":"2018-11-26","max":24,"avg":21,"min":12.2},{"date":"2018-11-27","max":23.4,"avg":19.5,"min":10.8},{"date":"2018-11-28","max":24.1,"avg":21.8,"min":16}],"humidity":[{"date":"2018-11-24","max":0.84,"avg":0.79,"min":0.77},{"date":"2018-11-25","max":0.82,"avg":0.76,"min":0.65},{"date":"2018-11-26","max":0.88,"avg":0.81,"min":0.71},{"date":"2018-11-27","max":0.88,"avg":0.86,"min":0.81},{"date":"2018-11-28","max":0.89,"avg":0.85,"min":0.71}],"astro":[{"date":"2018-11-24","sunset":{"time":"17:03"},"sunrise":{"time":"06:16"}},{"date":"2018-11-25","sunset":{"time":"17:03"},"sunrise":{"time":"06:17"}},{"date":"2018-11-26","sunset":{"time":"17:03"},"sunrise":{"time":"06:17"}},{"date":"2018-11-27","sunset":{"time":"17:03"},"sunrise":{"time":"06:18"}},{"date":"2018-11-28","sunset":{"time":"17:03"},"sunrise":{"time":"06:19"}}],"coldRisk":[{"index":"3","desc":"易发","datetime":"2018-11-24"},{"index":"3","desc":"易发","datetime":"2018-11-25"},{"index":"3","desc":"易发","datetime":"2018-11-26"},{"index":"3","desc":"易发","datetime":"2018-11-27"},{"index":"3","desc":"易发","datetime":"2018-11-28"}],"ultraviolet":[{"index":"2","desc":"弱","datetime":"2018-11-24"},{"index":"4","desc":"强","datetime":"2018-11-25"},{"index":"1","desc":"最弱","datetime":"2018-11-26"},{"index":"1","desc":"最弱","datetime":"2018-11-27"},{"index":"1","desc":"最弱","datetime":"2018-11-28"}],"pres":[{"date":"2018-11-24","max":100599.86,"avg":100587.45,"min":100310.2},{"date":"2018-11-25","max":100550.2,"avg":100333.22,"min":100169.19},{"date":"2018-11-26","max":100550.46,"avg":100359.25,"min":100180.79},{"date":"2018-11-27","max":100569.19,"avg":100419.36,"min":100249.19},{"date":"2018-11-28","max":100580.79,"avg":100319.32,"min":100162.06}],"pm25":[{"date":"2018-11-24","max":16,"avg":14.25,"min":2},{"date":"2018-11-25","max":29,"avg":23.08,"min":18},{"date":"2018-11-26","max":30,"avg":26.38,"min":24},{"date":"2018-11-27","max":23,"avg":15.83,"min":13},{"date":"2018-11-28","max":22,"avg":19.29,"min":17}],"dressing":[{"index":"5","desc":"凉爽","datetime":"2018-11-24"},{"index":"5","desc":"凉爽","datetime":"2018-11-25"},{"index":"4","desc":"温暖","datetime":"2018-11-26"},{"index":"4","desc":"温暖","datetime":"2018-11-27"},{"index":"4","desc":"温暖","datetime":"2018-11-28"}],"carWashing":[{"index":"3","desc":"较不适宜","datetime":"2018-11-24"},{"index":"3","desc":"较不适宜","datetime":"2018-11-25"},{"index":"3","desc":"较不适宜","datetime":"2018-11-26"},{"index":"3","desc":"较不适宜","datetime":"2018-11-27"},{"index":"3","desc":"较不适宜","datetime":"2018-11-28"}],"precipitation":[{"date":"2018-11-24","max":0.1849,"avg":0,"min":0},{"date":"2018-11-25","max":0.0644,"avg":0.0077,"min":0},{"date":"2018-11-26","max":0.2005,"avg":0.0412,"min":0},{"date":"2018-11-27","max":0.2547,"avg":0.1059,"min":0},{"date":"2018-11-28","max":0.1667,"avg":0.0402,"min":0}],"wind":[{"date":"2018-11-24","max":{"direction":103.08,"speed":26.56},"avg":{"direction":95.09,"speed":22.15},"min":{"direction":81.66,"speed":19.59}},{"date":"2018-11-25","max":{"direction":111.44,"speed":24.95},"avg":{"direction":127.4,"speed":17.11},"min":{"direction":140.28,"speed":13.5}},{"date":"2018-11-26","max":{"direction":141.08,"speed":12.72},"avg":{"direction":93.2,"speed":8.92},"min":{"direction":59.75,"speed":5.82}},{"date":"2018-11-27","max":{"direction":74.3,"speed":15.94},"avg":{"direction":62.7,"speed":11.71},"min":{"direction":51.22,"speed":7.31}},{"date":"2018-11-28","max":{"direction":339.74,"speed":18.07},"avg":{"direction":0.87,"speed":11.09},"min":{"direction":232.42,"speed":6.81}}],"skycon_08h_20h":[{"date":"2018-11-24","value":"RAIN"},{"date":"2018-11-25","value":"CLEAR_DAY"},{"date":"2018-11-26","value":"CLOUDY"},{"date":"2018-11-27","value":"RAIN"},{"date":"2018-11-28","value":"CLOUDY"}]}
         * primary : 0
         */

        private HourlyBean hourly;
        private String forecast_keypoint;
        private MinutelyBean minutely;
        private DailyBean daily;
        private double primary;

        public HourlyBean getHourly() {
            return hourly;
        }

        public void setHourly(HourlyBean hourly) {
            this.hourly = hourly;
        }

        public String getForecast_keypoint() {
            return forecast_keypoint;
        }

        public void setForecast_keypoint(String forecast_keypoint) {
            this.forecast_keypoint = forecast_keypoint;
        }

        public MinutelyBean getMinutely() {
            return minutely;
        }

        public void setMinutely(MinutelyBean minutely) {
            this.minutely = minutely;
        }

        public DailyBean getDaily() {
            return daily;
        }

        public void setDaily(DailyBean daily) {
            this.daily = daily;
        }

        public double getPrimary() {
            return primary;
        }

        public void setPrimary(double primary) {
            this.primary = primary;
        }

        public static class HourlyBean {
            /**
             * status : ok
             * description : 多云，云渐少，明天凌晨3点钟后转至晴
             * skycon : [{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 20:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 21:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 22:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-24 23:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 00:00"},{"value":"RAIN","datetime":"2018-11-25 01:00"},{"value":"RAIN","datetime":"2018-11-25 02:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 03:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 04:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 05:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 06:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 07:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 08:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 09:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 10:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 11:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 12:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 13:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 14:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 15:00"},{"value":"CLEAR_DAY","datetime":"2018-11-25 16:00"},{"value":"CLEAR_NIGHT","datetime":"2018-11-25 17:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 18:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 19:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 20:00"},{"value":"CLOUDY","datetime":"2018-11-25 21:00"},{"value":"CLOUDY","datetime":"2018-11-25 22:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-25 23:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 00:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 01:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 02:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 03:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 04:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 05:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2018-11-26 06:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2018-11-26 07:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2018-11-26 08:00"},{"value":"CLOUDY","datetime":"2018-11-26 09:00"},{"value":"CLOUDY","datetime":"2018-11-26 10:00"},{"value":"CLOUDY","datetime":"2018-11-26 11:00"},{"value":"CLOUDY","datetime":"2018-11-26 12:00"},{"value":"CLOUDY","datetime":"2018-11-26 13:00"},{"value":"CLOUDY","datetime":"2018-11-26 14:00"},{"value":"RAIN","datetime":"2018-11-26 15:00"},{"value":"RAIN","datetime":"2018-11-26 16:00"},{"value":"RAIN","datetime":"2018-11-26 17:00"},{"value":"RAIN","datetime":"2018-11-26 18:00"},{"value":"RAIN","datetime":"2018-11-26 19:00"}]
             * cloudrate : [{"value":0.58,"datetime":"2018-11-24 20:00"},{"value":0.61,"datetime":"2018-11-24 21:00"},{"value":0.77,"datetime":"2018-11-24 22:00"},{"value":0.67,"datetime":"2018-11-24 23:00"},{"value":0.6,"datetime":"2018-11-25 00:00"},{"value":0.53,"datetime":"2018-11-25 01:00"},{"value":0.41,"datetime":"2018-11-25 02:00"},{"value":0.02,"datetime":"2018-11-25 03:00"},{"value":0.01,"datetime":"2018-11-25 04:00"},{"value":0.01,"datetime":"2018-11-25 05:00"},{"value":0.01,"datetime":"2018-11-25 06:00"},{"value":0,"datetime":"2018-11-25 07:00"},{"value":0,"datetime":"2018-11-25 08:00"},{"value":0.14,"datetime":"2018-11-25 09:00"},{"value":0.07,"datetime":"2018-11-25 10:00"},{"value":0.05,"datetime":"2018-11-25 11:00"},{"value":0.04,"datetime":"2018-11-25 12:00"},{"value":0.03,"datetime":"2018-11-25 13:00"},{"value":0.03,"datetime":"2018-11-25 14:00"},{"value":0,"datetime":"2018-11-25 15:00"},{"value":0,"datetime":"2018-11-25 16:00"},{"value":0.1,"datetime":"2018-11-25 17:00"},{"value":0.26,"datetime":"2018-11-25 18:00"},{"value":0.35,"datetime":"2018-11-25 19:00"},{"value":0.42,"datetime":"2018-11-25 20:00"},{"value":0.92,"datetime":"2018-11-25 21:00"},{"value":0.81,"datetime":"2018-11-25 22:00"},{"value":0.69,"datetime":"2018-11-25 23:00"},{"value":0.66,"datetime":"2018-11-26 00:00"},{"value":0.67,"datetime":"2018-11-26 01:00"},{"value":0.67,"datetime":"2018-11-26 02:00"},{"value":0.62,"datetime":"2018-11-26 03:00"},{"value":0.72,"datetime":"2018-11-26 04:00"},{"value":0.69,"datetime":"2018-11-26 05:00"},{"value":0.68,"datetime":"2018-11-26 06:00"},{"value":0.71,"datetime":"2018-11-26 07:00"},{"value":0.73,"datetime":"2018-11-26 08:00"},{"value":0.98,"datetime":"2018-11-26 09:00"},{"value":0.89,"datetime":"2018-11-26 10:00"},{"value":0.85,"datetime":"2018-11-26 11:00"},{"value":0.85,"datetime":"2018-11-26 12:00"},{"value":0.85,"datetime":"2018-11-26 13:00"},{"value":0.85,"datetime":"2018-11-26 14:00"},{"value":0.96,"datetime":"2018-11-26 15:00"},{"value":0.97,"datetime":"2018-11-26 16:00"},{"value":0.97,"datetime":"2018-11-26 17:00"},{"value":0.96,"datetime":"2018-11-26 18:00"},{"value":0.96,"datetime":"2018-11-26 19:00"}]
             * aqi : [{"value":32,"datetime":"2018-11-24 20:00"},{"value":20,"datetime":"2018-11-24 21:00"},{"value":21,"datetime":"2018-11-24 22:00"},{"value":23,"datetime":"2018-11-24 23:00"},{"value":26,"datetime":"2018-11-25 00:00"},{"value":27,"datetime":"2018-11-25 01:00"},{"value":27,"datetime":"2018-11-25 02:00"},{"value":29,"datetime":"2018-11-25 03:00"},{"value":30,"datetime":"2018-11-25 04:00"},{"value":30,"datetime":"2018-11-25 05:00"},{"value":31,"datetime":"2018-11-25 06:00"},{"value":31,"datetime":"2018-11-25 07:00"},{"value":31,"datetime":"2018-11-25 08:00"},{"value":31,"datetime":"2018-11-25 09:00"},{"value":33,"datetime":"2018-11-25 10:00"},{"value":33,"datetime":"2018-11-25 11:00"},{"value":33,"datetime":"2018-11-25 12:00"},{"value":33,"datetime":"2018-11-25 13:00"},{"value":33,"datetime":"2018-11-25 14:00"},{"value":33,"datetime":"2018-11-25 15:00"},{"value":33,"datetime":"2018-11-25 16:00"},{"value":34,"datetime":"2018-11-25 17:00"},{"value":36,"datetime":"2018-11-25 18:00"},{"value":37,"datetime":"2018-11-25 19:00"},{"value":39,"datetime":"2018-11-25 20:00"},{"value":40,"datetime":"2018-11-25 21:00"},{"value":40,"datetime":"2018-11-25 22:00"},{"value":41,"datetime":"2018-11-25 23:00"},{"value":43,"datetime":"2018-11-26 00:00"},{"value":43,"datetime":"2018-11-26 01:00"},{"value":43,"datetime":"2018-11-26 02:00"},{"value":41,"datetime":"2018-11-26 03:00"},{"value":40,"datetime":"2018-11-26 04:00"},{"value":39,"datetime":"2018-11-26 05:00"},{"value":37,"datetime":"2018-11-26 06:00"},{"value":37,"datetime":"2018-11-26 07:00"},{"value":37,"datetime":"2018-11-26 08:00"},{"value":36,"datetime":"2018-11-26 09:00"},{"value":36,"datetime":"2018-11-26 10:00"},{"value":36,"datetime":"2018-11-26 11:00"},{"value":36,"datetime":"2018-11-26 12:00"},{"value":36,"datetime":"2018-11-26 13:00"},{"value":36,"datetime":"2018-11-26 14:00"},{"value":36,"datetime":"2018-11-26 15:00"},{"value":37,"datetime":"2018-11-26 16:00"},{"value":37,"datetime":"2018-11-26 17:00"},{"value":39,"datetime":"2018-11-26 18:00"},{"value":39,"datetime":"2018-11-26 19:00"}]
             * dswrf : [{"value":103.6064256,"datetime":"2018-11-24 20:00"},{"value":0,"datetime":"2018-11-24 21:00"},{"value":0,"datetime":"2018-11-24 22:00"},{"value":0,"datetime":"2018-11-24 23:00"},{"value":0,"datetime":"2018-11-25 00:00"},{"value":0,"datetime":"2018-11-25 01:00"},{"value":0,"datetime":"2018-11-25 02:00"},{"value":0,"datetime":"2018-11-25 03:00"},{"value":0,"datetime":"2018-11-25 04:00"},{"value":0,"datetime":"2018-11-25 05:00"},{"value":0,"datetime":"2018-11-25 06:00"},{"value":7.6260608,"datetime":"2018-11-25 07:00"},{"value":36.52521216,"datetime":"2018-11-25 08:00"},{"value":390,"datetime":"2018-11-25 09:00"},{"value":473.792,"datetime":"2018-11-25 10:00"},{"value":537.6260608,"datetime":"2018-11-25 11:00"},{"value":581.4500608,"datetime":"2018-11-25 12:00"},{"value":603.792,"datetime":"2018-11-25 13:00"},{"value":603.792,"datetime":"2018-11-25 14:00"},{"value":450,"datetime":"2018-11-25 15:00"},{"value":355.2841216,"datetime":"2018-11-25 16:00"},{"value":257.6260608,"datetime":"2018-11-25 17:00"},{"value":190,"datetime":"2018-11-25 18:00"},{"value":151.4500608,"datetime":"2018-11-25 19:00"},{"value":128.43282432,"datetime":"2018-11-25 20:00"},{"value":0,"datetime":"2018-11-25 21:00"},{"value":0,"datetime":"2018-11-25 22:00"},{"value":0,"datetime":"2018-11-25 23:00"},{"value":0,"datetime":"2018-11-26 00:00"},{"value":0,"datetime":"2018-11-26 01:00"},{"value":0,"datetime":"2018-11-26 02:00"},{"value":0,"datetime":"2018-11-26 03:00"},{"value":0,"datetime":"2018-11-26 04:00"},{"value":0,"datetime":"2018-11-26 05:00"},{"value":0,"datetime":"2018-11-26 06:00"},{"value":0,"datetime":"2018-11-26 07:00"},{"value":11.31602432,"datetime":"2018-11-26 08:00"},{"value":73.9844864,"datetime":"2018-11-26 09:00"},{"value":157.8135808,"datetime":"2018-11-26 10:00"},{"value":241.3560064,"datetime":"2018-11-26 11:00"},{"value":289.5503104,"datetime":"2018-11-26 12:00"},{"value":313.2783104,"datetime":"2018-11-26 13:00"},{"value":305.6202496,"datetime":"2018-11-26 14:00"},{"value":103.972608,"datetime":"2018-11-26 15:00"},{"value":72.5124864,"datetime":"2018-11-26 16:00"},{"value":53.4363648,"datetime":"2018-11-26 17:00"},{"value":41.986304,"datetime":"2018-11-26 18:00"},{"value":34.3602432,"datetime":"2018-11-26 19:00"}]
             * visibility : [{"value":23.28,"datetime":"2018-11-24 20:00"},{"value":21.88,"datetime":"2018-11-24 21:00"},{"value":21.91,"datetime":"2018-11-24 22:00"},{"value":22.29,"datetime":"2018-11-24 23:00"},{"value":22.71,"datetime":"2018-11-25 00:00"},{"value":23.3,"datetime":"2018-11-25 01:00"},{"value":23.47,"datetime":"2018-11-25 02:00"},{"value":24.1,"datetime":"2018-11-25 03:00"},{"value":24.1,"datetime":"2018-11-25 04:00"},{"value":24.1,"datetime":"2018-11-25 05:00"},{"value":24.1,"datetime":"2018-11-25 06:00"},{"value":24.1,"datetime":"2018-11-25 07:00"},{"value":24.1,"datetime":"2018-11-25 08:00"},{"value":24.1,"datetime":"2018-11-25 09:00"},{"value":24.1,"datetime":"2018-11-25 10:00"},{"value":24.1,"datetime":"2018-11-25 11:00"},{"value":24.1,"datetime":"2018-11-25 12:00"},{"value":24.1,"datetime":"2018-11-25 13:00"},{"value":24.1,"datetime":"2018-11-25 14:00"},{"value":24.1,"datetime":"2018-11-25 15:00"},{"value":24.1,"datetime":"2018-11-25 16:00"},{"value":23.17,"datetime":"2018-11-25 17:00"},{"value":23.33,"datetime":"2018-11-25 18:00"},{"value":23.53,"datetime":"2018-11-25 19:00"},{"value":23.47,"datetime":"2018-11-25 20:00"},{"value":23.45,"datetime":"2018-11-25 21:00"},{"value":23.45,"datetime":"2018-11-25 22:00"},{"value":23.43,"datetime":"2018-11-25 23:00"},{"value":23.55,"datetime":"2018-11-26 00:00"},{"value":23.88,"datetime":"2018-11-26 01:00"},{"value":23.95,"datetime":"2018-11-26 02:00"},{"value":23.94,"datetime":"2018-11-26 03:00"},{"value":23.52,"datetime":"2018-11-26 04:00"},{"value":23.18,"datetime":"2018-11-26 05:00"},{"value":23.13,"datetime":"2018-11-26 06:00"},{"value":23.37,"datetime":"2018-11-26 07:00"},{"value":23.45,"datetime":"2018-11-26 08:00"},{"value":23.27,"datetime":"2018-11-26 09:00"},{"value":23.79,"datetime":"2018-11-26 10:00"},{"value":23.61,"datetime":"2018-11-26 11:00"},{"value":23.78,"datetime":"2018-11-26 12:00"},{"value":20.3,"datetime":"2018-11-26 13:00"},{"value":23.09,"datetime":"2018-11-26 14:00"},{"value":21.1,"datetime":"2018-11-26 15:00"},{"value":22.08,"datetime":"2018-11-26 16:00"},{"value":18.97,"datetime":"2018-11-26 17:00"},{"value":21.92,"datetime":"2018-11-26 18:00"},{"value":14.85,"datetime":"2018-11-26 19:00"}]
             * humidity : [{"value":0.8,"datetime":"2018-11-24 20:00"},{"value":0.8,"datetime":"2018-11-24 21:00"},{"value":0.78,"datetime":"2018-11-24 22:00"},{"value":0.77,"datetime":"2018-11-24 23:00"},{"value":0.78,"datetime":"2018-11-25 00:00"},{"value":0.78,"datetime":"2018-11-25 01:00"},{"value":0.81,"datetime":"2018-11-25 02:00"},{"value":0.8,"datetime":"2018-11-25 03:00"},{"value":0.81,"datetime":"2018-11-25 04:00"},{"value":0.82,"datetime":"2018-11-25 05:00"},{"value":0.82,"datetime":"2018-11-25 06:00"},{"value":0.82,"datetime":"2018-11-25 07:00"},{"value":0.77,"datetime":"2018-11-25 08:00"},{"value":0.73,"datetime":"2018-11-25 09:00"},{"value":0.69,"datetime":"2018-11-25 10:00"},{"value":0.67,"datetime":"2018-11-25 11:00"},{"value":0.65,"datetime":"2018-11-25 12:00"},{"value":0.65,"datetime":"2018-11-25 13:00"},{"value":0.66,"datetime":"2018-11-25 14:00"},{"value":0.67,"datetime":"2018-11-25 15:00"},{"value":0.7,"datetime":"2018-11-25 16:00"},{"value":0.75,"datetime":"2018-11-25 17:00"},{"value":0.77,"datetime":"2018-11-25 18:00"},{"value":0.78,"datetime":"2018-11-25 19:00"},{"value":0.79,"datetime":"2018-11-25 20:00"},{"value":0.8,"datetime":"2018-11-25 21:00"},{"value":0.81,"datetime":"2018-11-25 22:00"},{"value":0.82,"datetime":"2018-11-25 23:00"},{"value":0.82,"datetime":"2018-11-26 00:00"},{"value":0.82,"datetime":"2018-11-26 01:00"},{"value":0.82,"datetime":"2018-11-26 02:00"},{"value":0.81,"datetime":"2018-11-26 03:00"},{"value":0.8,"datetime":"2018-11-26 04:00"},{"value":0.8,"datetime":"2018-11-26 05:00"},{"value":0.8,"datetime":"2018-11-26 06:00"},{"value":0.79,"datetime":"2018-11-26 07:00"},{"value":0.77,"datetime":"2018-11-26 08:00"},{"value":0.78,"datetime":"2018-11-26 09:00"},{"value":0.75,"datetime":"2018-11-26 10:00"},{"value":0.72,"datetime":"2018-11-26 11:00"},{"value":0.71,"datetime":"2018-11-26 12:00"},{"value":0.71,"datetime":"2018-11-26 13:00"},{"value":0.74,"datetime":"2018-11-26 14:00"},{"value":0.79,"datetime":"2018-11-26 15:00"},{"value":0.83,"datetime":"2018-11-26 16:00"},{"value":0.85,"datetime":"2018-11-26 17:00"},{"value":0.86,"datetime":"2018-11-26 18:00"},{"value":0.87,"datetime":"2018-11-26 19:00"}]
             * pres : [{"value":100550.2003200001,"datetime":"2018-11-24 20:00"},{"value":100599.8643200001,"datetime":"2018-11-24 21:00"},{"value":100599.8643200001,"datetime":"2018-11-24 22:00"},{"value":100599.8643200001,"datetime":"2018-11-24 23:00"},{"value":100550.20032,"datetime":"2018-11-25 00:00"},{"value":100470.2003200001,"datetime":"2018-11-25 01:00"},{"value":100439.8643200001,"datetime":"2018-11-25 02:00"},{"value":100390.2003200001,"datetime":"2018-11-25 03:00"},{"value":100359.8643200001,"datetime":"2018-11-25 04:00"},{"value":100371.4648064001,"datetime":"2018-11-25 05:00"},{"value":100390.2003200001,"datetime":"2018-11-25 06:00"},{"value":100390.2003200001,"datetime":"2018-11-25 07:00"},{"value":100390.2003200001,"datetime":"2018-11-25 08:00"},{"value":100409.1918336001,"datetime":"2018-11-25 09:00"},{"value":100409.1918336001,"datetime":"2018-11-25 10:00"},{"value":100390.2003200001,"datetime":"2018-11-25 11:00"},{"value":100310.2003200001,"datetime":"2018-11-25 12:00"},{"value":100230.2003200001,"datetime":"2018-11-25 13:00"},{"value":100169.1918336001,"datetime":"2018-11-25 14:00"},{"value":100169.1918336001,"datetime":"2018-11-25 15:00"},{"value":100169.1918336001,"datetime":"2018-11-25 16:00"},{"value":100230.2003200001,"datetime":"2018-11-25 17:00"},{"value":100230.2003200001,"datetime":"2018-11-25 18:00"},{"value":100249.1918336001,"datetime":"2018-11-25 19:00"},{"value":100310.20032,"datetime":"2018-11-25 20:00"},{"value":100329.1918336001,"datetime":"2018-11-25 21:00"},{"value":100329.1918336001,"datetime":"2018-11-25 22:00"},{"value":100310.2003200001,"datetime":"2018-11-25 23:00"},{"value":100310.20032,"datetime":"2018-11-26 00:00"},{"value":100260.7923200001,"datetime":"2018-11-26 01:00"},{"value":100211.4648064001,"datetime":"2018-11-26 02:00"},{"value":100180.7923200001,"datetime":"2018-11-26 03:00"},{"value":100180.7923200001,"datetime":"2018-11-26 04:00"},{"value":100180.7923200001,"datetime":"2018-11-26 05:00"},{"value":100260.79232,"datetime":"2018-11-26 06:00"},{"value":100390.4563200001,"datetime":"2018-11-26 07:00"},{"value":100420.7923200001,"datetime":"2018-11-26 08:00"},{"value":100489.1918336001,"datetime":"2018-11-26 09:00"},{"value":100470.4563200001,"datetime":"2018-11-26 10:00"},{"value":100409.1918336001,"datetime":"2018-11-26 11:00"},{"value":100390.4563200001,"datetime":"2018-11-26 12:00"},{"value":100291.4648064001,"datetime":"2018-11-26 13:00"},{"value":100230.4563200001,"datetime":"2018-11-26 14:00"},{"value":100310.4563200001,"datetime":"2018-11-26 15:00"},{"value":100260.7923200001,"datetime":"2018-11-26 16:00"},{"value":100310.4563200001,"datetime":"2018-11-26 17:00"},{"value":100420.7923200001,"datetime":"2018-11-26 18:00"},{"value":100489.1918336001,"datetime":"2018-11-26 19:00"}]
             * pm25 : [{"value":12,"datetime":"2018-11-24 20:00"},{"value":14,"datetime":"2018-11-24 21:00"},{"value":15,"datetime":"2018-11-24 22:00"},{"value":16,"datetime":"2018-11-24 23:00"},{"value":18,"datetime":"2018-11-25 00:00"},{"value":19,"datetime":"2018-11-25 01:00"},{"value":19,"datetime":"2018-11-25 02:00"},{"value":20,"datetime":"2018-11-25 03:00"},{"value":21,"datetime":"2018-11-25 04:00"},{"value":21,"datetime":"2018-11-25 05:00"},{"value":22,"datetime":"2018-11-25 06:00"},{"value":22,"datetime":"2018-11-25 07:00"},{"value":22,"datetime":"2018-11-25 08:00"},{"value":22,"datetime":"2018-11-25 09:00"},{"value":23,"datetime":"2018-11-25 10:00"},{"value":23,"datetime":"2018-11-25 11:00"},{"value":23,"datetime":"2018-11-25 12:00"},{"value":23,"datetime":"2018-11-25 13:00"},{"value":23,"datetime":"2018-11-25 14:00"},{"value":23,"datetime":"2018-11-25 15:00"},{"value":23,"datetime":"2018-11-25 16:00"},{"value":24,"datetime":"2018-11-25 17:00"},{"value":25,"datetime":"2018-11-25 18:00"},{"value":26,"datetime":"2018-11-25 19:00"},{"value":27,"datetime":"2018-11-25 20:00"},{"value":28,"datetime":"2018-11-25 21:00"},{"value":28,"datetime":"2018-11-25 22:00"},{"value":29,"datetime":"2018-11-25 23:00"},{"value":30,"datetime":"2018-11-26 00:00"},{"value":30,"datetime":"2018-11-26 01:00"},{"value":30,"datetime":"2018-11-26 02:00"},{"value":29,"datetime":"2018-11-26 03:00"},{"value":28,"datetime":"2018-11-26 04:00"},{"value":27,"datetime":"2018-11-26 05:00"},{"value":26,"datetime":"2018-11-26 06:00"},{"value":26,"datetime":"2018-11-26 07:00"},{"value":26,"datetime":"2018-11-26 08:00"},{"value":25,"datetime":"2018-11-26 09:00"},{"value":25,"datetime":"2018-11-26 10:00"},{"value":25,"datetime":"2018-11-26 11:00"},{"value":25,"datetime":"2018-11-26 12:00"},{"value":25,"datetime":"2018-11-26 13:00"},{"value":25,"datetime":"2018-11-26 14:00"},{"value":25,"datetime":"2018-11-26 15:00"},{"value":26,"datetime":"2018-11-26 16:00"},{"value":26,"datetime":"2018-11-26 17:00"},{"value":27,"datetime":"2018-11-26 18:00"},{"value":27,"datetime":"2018-11-26 19:00"}]
             * precipitation : [{"value":0,"datetime":"2018-11-24 20:00"},{"value":0,"datetime":"2018-11-24 21:00"},{"value":0,"datetime":"2018-11-24 22:00"},{"value":0,"datetime":"2018-11-24 23:00"},{"value":0.057,"datetime":"2018-11-25 00:00"},{"value":0.0644,"datetime":"2018-11-25 01:00"},{"value":0.0644,"datetime":"2018-11-25 02:00"},{"value":0,"datetime":"2018-11-25 03:00"},{"value":0,"datetime":"2018-11-25 04:00"},{"value":0,"datetime":"2018-11-25 05:00"},{"value":0,"datetime":"2018-11-25 06:00"},{"value":0,"datetime":"2018-11-25 07:00"},{"value":0,"datetime":"2018-11-25 08:00"},{"value":0,"datetime":"2018-11-25 09:00"},{"value":0,"datetime":"2018-11-25 10:00"},{"value":0,"datetime":"2018-11-25 11:00"},{"value":0,"datetime":"2018-11-25 12:00"},{"value":0,"datetime":"2018-11-25 13:00"},{"value":0,"datetime":"2018-11-25 14:00"},{"value":0,"datetime":"2018-11-25 15:00"},{"value":0,"datetime":"2018-11-25 16:00"},{"value":0,"datetime":"2018-11-25 17:00"},{"value":0,"datetime":"2018-11-25 18:00"},{"value":0,"datetime":"2018-11-25 19:00"},{"value":0,"datetime":"2018-11-25 20:00"},{"value":0,"datetime":"2018-11-25 21:00"},{"value":0,"datetime":"2018-11-25 22:00"},{"value":0,"datetime":"2018-11-25 23:00"},{"value":0,"datetime":"2018-11-26 00:00"},{"value":0,"datetime":"2018-11-26 01:00"},{"value":0,"datetime":"2018-11-26 02:00"},{"value":0,"datetime":"2018-11-26 03:00"},{"value":0,"datetime":"2018-11-26 04:00"},{"value":0,"datetime":"2018-11-26 05:00"},{"value":0,"datetime":"2018-11-26 06:00"},{"value":0,"datetime":"2018-11-26 07:00"},{"value":0,"datetime":"2018-11-26 08:00"},{"value":0,"datetime":"2018-11-26 09:00"},{"value":0,"datetime":"2018-11-26 10:00"},{"value":0,"datetime":"2018-11-26 11:00"},{"value":0,"datetime":"2018-11-26 12:00"},{"value":0,"datetime":"2018-11-26 13:00"},{"value":0,"datetime":"2018-11-26 14:00"},{"value":0.1437,"datetime":"2018-11-26 15:00"},{"value":0.1127,"datetime":"2018-11-26 16:00"},{"value":0.0817,"datetime":"2018-11-26 17:00"},{"value":0.0796,"datetime":"2018-11-26 18:00"},{"value":0.0725,"datetime":"2018-11-26 19:00"}]
             * wind : [{"direction":99.63,"speed":25.65,"datetime":"2018-11-24 20:00"},{"direction":98.09,"speed":24.99,"datetime":"2018-11-24 21:00"},{"direction":103.08,"speed":26.56,"datetime":"2018-11-24 22:00"},{"direction":106.83,"speed":25.88,"datetime":"2018-11-24 23:00"},{"direction":111.44,"speed":24.95,"datetime":"2018-11-25 00:00"},{"direction":115.22,"speed":23.84,"datetime":"2018-11-25 01:00"},{"direction":114.87,"speed":19.91,"datetime":"2018-11-25 02:00"},{"direction":121.42,"speed":20.54,"datetime":"2018-11-25 03:00"},{"direction":124.14,"speed":18.95,"datetime":"2018-11-25 04:00"},{"direction":126.86,"speed":17.33,"datetime":"2018-11-25 05:00"},{"direction":130.15,"speed":15.85,"datetime":"2018-11-25 06:00"},{"direction":132.06,"speed":15.17,"datetime":"2018-11-25 07:00"},{"direction":132.5,"speed":15.88,"datetime":"2018-11-25 08:00"},{"direction":131.54,"speed":16.5,"datetime":"2018-11-25 09:00"},{"direction":129.95,"speed":16.84,"datetime":"2018-11-25 10:00"},{"direction":127.34,"speed":17,"datetime":"2018-11-25 11:00"},{"direction":124.23,"speed":17.52,"datetime":"2018-11-25 12:00"},{"direction":124.76,"speed":18.12,"datetime":"2018-11-25 13:00"},{"direction":127.08,"speed":18.72,"datetime":"2018-11-25 14:00"},{"direction":130.26,"speed":18.08,"datetime":"2018-11-25 15:00"},{"direction":129.9,"speed":15.94,"datetime":"2018-11-25 16:00"},{"direction":128.89,"speed":14.25,"datetime":"2018-11-25 17:00"},{"direction":131.84,"speed":14.81,"datetime":"2018-11-25 18:00"},{"direction":136.02,"speed":14.82,"datetime":"2018-11-25 19:00"},{"direction":136.53,"speed":14.58,"datetime":"2018-11-25 20:00"},{"direction":138.79,"speed":14.03,"datetime":"2018-11-25 21:00"},{"direction":139.26,"speed":13.57,"datetime":"2018-11-25 22:00"},{"direction":140.28,"speed":13.5,"datetime":"2018-11-25 23:00"},{"direction":141.08,"speed":12.72,"datetime":"2018-11-26 00:00"},{"direction":142.7,"speed":11.81,"datetime":"2018-11-26 01:00"},{"direction":142.7,"speed":11.5,"datetime":"2018-11-26 02:00"},{"direction":147.64,"speed":9.24,"datetime":"2018-11-26 03:00"},{"direction":145.46,"speed":8.86,"datetime":"2018-11-26 04:00"},{"direction":150.92,"speed":8.63,"datetime":"2018-11-26 05:00"},{"direction":160.66,"speed":7.74,"datetime":"2018-11-26 06:00"},{"direction":163.12,"speed":6.35,"datetime":"2018-11-26 07:00"},{"direction":150.98,"speed":6.31,"datetime":"2018-11-26 08:00"},{"direction":135.86,"speed":6.55,"datetime":"2018-11-26 09:00"},{"direction":120.28,"speed":6.39,"datetime":"2018-11-26 10:00"},{"direction":98.44,"speed":6.97,"datetime":"2018-11-26 11:00"},{"direction":81.46,"speed":6.9,"datetime":"2018-11-26 12:00"},{"direction":80.35,"speed":8.38,"datetime":"2018-11-26 13:00"},{"direction":59.75,"speed":5.82,"datetime":"2018-11-26 14:00"},{"direction":3.97,"speed":8.45,"datetime":"2018-11-26 15:00"},{"direction":16.04,"speed":9.67,"datetime":"2018-11-26 16:00"},{"direction":34.88,"speed":10.6,"datetime":"2018-11-26 17:00"},{"direction":41.64,"speed":9.96,"datetime":"2018-11-26 18:00"},{"direction":46.29,"speed":10.27,"datetime":"2018-11-26 19:00"}]
             * temperature : [{"value":20,"datetime":"2018-11-24 20:00"},{"value":20,"datetime":"2018-11-24 21:00"},{"value":19,"datetime":"2018-11-24 22:00"},{"value":19,"datetime":"2018-11-24 23:00"},{"value":19,"datetime":"2018-11-25 00:00"},{"value":20,"datetime":"2018-11-25 01:00"},{"value":20,"datetime":"2018-11-25 02:00"},{"value":20,"datetime":"2018-11-25 03:00"},{"value":19,"datetime":"2018-11-25 04:00"},{"value":19,"datetime":"2018-11-25 05:00"},{"value":20,"datetime":"2018-11-25 06:00"},{"value":20,"datetime":"2018-11-25 07:00"},{"value":21,"datetime":"2018-11-25 08:00"},{"value":23,"datetime":"2018-11-25 09:00"},{"value":24,"datetime":"2018-11-25 10:00"},{"value":24,"datetime":"2018-11-25 11:00"},{"value":25,"datetime":"2018-11-25 12:00"},{"value":25,"datetime":"2018-11-25 13:00"},{"value":25,"datetime":"2018-11-25 14:00"},{"value":24,"datetime":"2018-11-25 15:00"},{"value":24,"datetime":"2018-11-25 16:00"},{"value":23,"datetime":"2018-11-25 17:00"},{"value":23,"datetime":"2018-11-25 18:00"},{"value":21.56,"datetime":"2018-11-25 19:00"},{"value":21.46,"datetime":"2018-11-25 20:00"},{"value":21.27,"datetime":"2018-11-25 21:00"},{"value":21.18,"datetime":"2018-11-25 22:00"},{"value":20.98,"datetime":"2018-11-25 23:00"},{"value":20.95,"datetime":"2018-11-26 00:00"},{"value":20.65,"datetime":"2018-11-26 01:00"},{"value":20.31,"datetime":"2018-11-26 02:00"},{"value":19.94,"datetime":"2018-11-26 03:00"},{"value":19.74,"datetime":"2018-11-26 04:00"},{"value":19.4,"datetime":"2018-11-26 05:00"},{"value":19,"datetime":"2018-11-26 06:00"},{"value":19.46,"datetime":"2018-11-26 07:00"},{"value":20.13,"datetime":"2018-11-26 08:00"},{"value":20.7,"datetime":"2018-11-26 09:00"},{"value":21.33,"datetime":"2018-11-26 10:00"},{"value":22.44,"datetime":"2018-11-26 11:00"},{"value":22.91,"datetime":"2018-11-26 12:00"},{"value":23,"datetime":"2018-11-26 13:00"},{"value":22.78,"datetime":"2018-11-26 14:00"},{"value":22.19,"datetime":"2018-11-26 15:00"},{"value":21.68,"datetime":"2018-11-26 16:00"},{"value":21.33,"datetime":"2018-11-26 17:00"},{"value":21.32,"datetime":"2018-11-26 18:00"},{"value":21.29,"datetime":"2018-11-26 19:00"}]
             */

            private String status;
            private String description;
            private List<SkyconBean> skycon;
            private List<CloudrateBean> cloudrate;
            private List<AqiBean> aqi;
            private List<DswrfBean> dswrf;
            private List<VisibilityBean> visibility;
            private List<HumidityBean> humidity;
            private List<PresBean> pres;
            private List<Pm25Bean> pm25;
            private List<PrecipitationBean> precipitation;
            private List<WindBean> wind;
            private List<TemperatureBean> temperature;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<SkyconBean> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBean> skycon) {
                this.skycon = skycon;
            }

            public List<CloudrateBean> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBean> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<AqiBean> getAqi() {
                return aqi;
            }

            public void setAqi(List<AqiBean> aqi) {
                this.aqi = aqi;
            }

            public List<DswrfBean> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfBean> dswrf) {
                this.dswrf = dswrf;
            }

            public List<VisibilityBean> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityBean> visibility) {
                this.visibility = visibility;
            }

            public List<HumidityBean> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBean> humidity) {
                this.humidity = humidity;
            }

            public List<PresBean> getPres() {
                return pres;
            }

            public void setPres(List<PresBean> pres) {
                this.pres = pres;
            }

            public List<Pm25Bean> getPm25() {
                return pm25;
            }

            public void setPm25(List<Pm25Bean> pm25) {
                this.pm25 = pm25;
            }

            public List<PrecipitationBean> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBean> precipitation) {
                this.precipitation = precipitation;
            }

            public List<WindBean> getWind() {
                return wind;
            }

            public void setWind(List<WindBean> wind) {
                this.wind = wind;
            }

            public List<TemperatureBean> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBean> temperature) {
                this.temperature = temperature;
            }

            public static class SkyconBean {
                /**
                 * value : PARTLY_CLOUDY_NIGHT
                 * datetime : 2018-11-24 20:00
                 */

                private String value;
                private String datetime;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class CloudrateBean {
                /**
                 * value : 0.58
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class AqiBean {
                /**
                 * value : 32
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class DswrfBean {
                /**
                 * value : 103.6064256
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class VisibilityBean {
                /**
                 * value : 23.28
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class HumidityBean {
                /**
                 * value : 0.8
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class PresBean {
                /**
                 * value : 100550.2003200001
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class Pm25Bean {
                /**
                 * value : 12
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class PrecipitationBean {
                /**
                 * value : 0
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class WindBean {
                /**
                 * direction : 99.63
                 * speed : 25.65
                 * datetime : 2018-11-24 20:00
                 */

                private double direction;
                private double speed;
                private String datetime;

                public double getDirection() {
                    return direction;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class TemperatureBean {
                /**
                 * value : 20
                 * datetime : 2018-11-24 20:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }
        }

        public static class MinutelyBean {
            /**
             * status : ok
             * description : 附近正在下雨，出门还是带把伞吧~
             * probability : [0.3466466069,0.3364901543,0.300388515,0.4155747294]
             * probability_4h : [0.3466466069,0.4155747294,0.2934017777,0.229771018]
             * datasource : radar
             * precipitation_2h : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             * precipitation : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             */

            private String status;
            private String description;
            private String datasource;
            private List<Double> probability;
            private List<Double> probability_4h;
            private List<Double> precipitation_2h;
            private List<Double> precipitation;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDatasource() {
                return datasource;
            }

            public void setDatasource(String datasource) {
                this.datasource = datasource;
            }

            public List<Double> getProbability() {
                return probability;
            }

            public void setProbability(List<Double> probability) {
                this.probability = probability;
            }

            public List<Double> getProbability_4h() {
                return probability_4h;
            }

            public void setProbability_4h(List<Double> probability_4h) {
                this.probability_4h = probability_4h;
            }

            public List<Double> getPrecipitation_2h() {
                return precipitation_2h;
            }

            public void setPrecipitation_2h(List<Double> precipitation_2h) {
                this.precipitation_2h = precipitation_2h;
            }

            public List<Double> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<Double> precipitation) {
                this.precipitation = precipitation;
            }
        }

        public static class DailyBean {
            /**
             * status : ok
             * comfort : [{"index":"4","desc":"温暖","datetime":"2018-11-24"},{"index":"4","desc":"温暖","datetime":"2018-11-25"},{"index":"4","desc":"温暖","datetime":"2018-11-26"},{"index":"4","desc":"温暖","datetime":"2018-11-27"},{"index":"4","desc":"温暖","datetime":"2018-11-28"}]
             * skycon_20h_32h : [{"date":"2018-11-24","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-25","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-26","value":"RAIN"},{"date":"2018-11-27","value":"CLOUDY"},{"date":"2018-11-28","value":"RAIN"}]
             * temperature : [{"date":"2018-11-24","max":23,"avg":19.5,"min":19},{"date":"2018-11-25","max":25,"avg":21.85,"min":19},{"date":"2018-11-26","max":23,"avg":21.01,"min":19},{"date":"2018-11-27","max":24,"avg":21.42,"min":19},{"date":"2018-11-28","max":22.29,"avg":20.4,"min":18}]
             * dswrf : [{"date":"2018-11-24","max":424.2,"avg":25.9,"min":0},{"date":"2018-11-25","max":603.8,"avg":198.6,"min":0},{"date":"2018-11-26","max":313.3,"avg":71.9,"min":0},{"date":"2018-11-27","max":308,"avg":86.2,"min":0},{"date":"2018-11-28","max":413,"avg":108.9,"min":0}]
             * cloudrate : [{"date":"2018-11-24","max":0.86,"avg":0.66,"min":0.41},{"date":"2018-11-25","max":0.92,"avg":0.23,"min":0},{"date":"2018-11-26","max":0.99,"avg":0.84,"min":0.62},{"date":"2018-11-27","max":1,"avg":0.94,"min":0.85},{"date":"2018-11-28","max":1,"avg":0.94,"min":0.79}]
             * aqi : [{"date":"2018-11-24","max":40,"avg":24,"min":9},{"date":"2018-11-25","max":41,"avg":32.96,"min":26},{"date":"2018-11-26","max":43,"avg":37.79,"min":34},{"date":"2018-11-27","max":33,"avg":22.67,"min":19},{"date":"2018-11-28","max":31,"avg":27.54,"min":24}]
             * skycon : [{"date":"2018-11-24","value":"PARTLY_CLOUDY_NIGHT"},{"date":"2018-11-25","value":"PARTLY_CLOUDY_DAY"},{"date":"2018-11-26","value":"CLOUDY"},{"date":"2018-11-27","value":"RAIN"},{"date":"2018-11-28","value":"CLOUDY"}]
             * visibility : [{"date":"2018-11-24","max":24.1,"avg":22.3,"min":9.7},{"date":"2018-11-25","max":24.1,"avg":23.8,"min":22.7},{"date":"2018-11-26","max":24,"avg":21,"min":12.2},{"date":"2018-11-27","max":23.4,"avg":19.5,"min":10.8},{"date":"2018-11-28","max":24.1,"avg":21.8,"min":16}]
             * humidity : [{"date":"2018-11-24","max":0.84,"avg":0.79,"min":0.77},{"date":"2018-11-25","max":0.82,"avg":0.76,"min":0.65},{"date":"2018-11-26","max":0.88,"avg":0.81,"min":0.71},{"date":"2018-11-27","max":0.88,"avg":0.86,"min":0.81},{"date":"2018-11-28","max":0.89,"avg":0.85,"min":0.71}]
             * astro : [{"date":"2018-11-24","sunset":{"time":"17:03"},"sunrise":{"time":"06:16"}},{"date":"2018-11-25","sunset":{"time":"17:03"},"sunrise":{"time":"06:17"}},{"date":"2018-11-26","sunset":{"time":"17:03"},"sunrise":{"time":"06:17"}},{"date":"2018-11-27","sunset":{"time":"17:03"},"sunrise":{"time":"06:18"}},{"date":"2018-11-28","sunset":{"time":"17:03"},"sunrise":{"time":"06:19"}}]
             * coldRisk : [{"index":"3","desc":"易发","datetime":"2018-11-24"},{"index":"3","desc":"易发","datetime":"2018-11-25"},{"index":"3","desc":"易发","datetime":"2018-11-26"},{"index":"3","desc":"易发","datetime":"2018-11-27"},{"index":"3","desc":"易发","datetime":"2018-11-28"}]
             * ultraviolet : [{"index":"2","desc":"弱","datetime":"2018-11-24"},{"index":"4","desc":"强","datetime":"2018-11-25"},{"index":"1","desc":"最弱","datetime":"2018-11-26"},{"index":"1","desc":"最弱","datetime":"2018-11-27"},{"index":"1","desc":"最弱","datetime":"2018-11-28"}]
             * pres : [{"date":"2018-11-24","max":100599.86,"avg":100587.45,"min":100310.2},{"date":"2018-11-25","max":100550.2,"avg":100333.22,"min":100169.19},{"date":"2018-11-26","max":100550.46,"avg":100359.25,"min":100180.79},{"date":"2018-11-27","max":100569.19,"avg":100419.36,"min":100249.19},{"date":"2018-11-28","max":100580.79,"avg":100319.32,"min":100162.06}]
             * pm25 : [{"date":"2018-11-24","max":16,"avg":14.25,"min":2},{"date":"2018-11-25","max":29,"avg":23.08,"min":18},{"date":"2018-11-26","max":30,"avg":26.38,"min":24},{"date":"2018-11-27","max":23,"avg":15.83,"min":13},{"date":"2018-11-28","max":22,"avg":19.29,"min":17}]
             * dressing : [{"index":"5","desc":"凉爽","datetime":"2018-11-24"},{"index":"5","desc":"凉爽","datetime":"2018-11-25"},{"index":"4","desc":"温暖","datetime":"2018-11-26"},{"index":"4","desc":"温暖","datetime":"2018-11-27"},{"index":"4","desc":"温暖","datetime":"2018-11-28"}]
             * carWashing : [{"index":"3","desc":"较不适宜","datetime":"2018-11-24"},{"index":"3","desc":"较不适宜","datetime":"2018-11-25"},{"index":"3","desc":"较不适宜","datetime":"2018-11-26"},{"index":"3","desc":"较不适宜","datetime":"2018-11-27"},{"index":"3","desc":"较不适宜","datetime":"2018-11-28"}]
             * precipitation : [{"date":"2018-11-24","max":0.1849,"avg":0,"min":0},{"date":"2018-11-25","max":0.0644,"avg":0.0077,"min":0},{"date":"2018-11-26","max":0.2005,"avg":0.0412,"min":0},{"date":"2018-11-27","max":0.2547,"avg":0.1059,"min":0},{"date":"2018-11-28","max":0.1667,"avg":0.0402,"min":0}]
             * wind : [{"date":"2018-11-24","max":{"direction":103.08,"speed":26.56},"avg":{"direction":95.09,"speed":22.15},"min":{"direction":81.66,"speed":19.59}},{"date":"2018-11-25","max":{"direction":111.44,"speed":24.95},"avg":{"direction":127.4,"speed":17.11},"min":{"direction":140.28,"speed":13.5}},{"date":"2018-11-26","max":{"direction":141.08,"speed":12.72},"avg":{"direction":93.2,"speed":8.92},"min":{"direction":59.75,"speed":5.82}},{"date":"2018-11-27","max":{"direction":74.3,"speed":15.94},"avg":{"direction":62.7,"speed":11.71},"min":{"direction":51.22,"speed":7.31}},{"date":"2018-11-28","max":{"direction":339.74,"speed":18.07},"avg":{"direction":0.87,"speed":11.09},"min":{"direction":232.42,"speed":6.81}}]
             * skycon_08h_20h : [{"date":"2018-11-24","value":"RAIN"},{"date":"2018-11-25","value":"CLEAR_DAY"},{"date":"2018-11-26","value":"CLOUDY"},{"date":"2018-11-27","value":"RAIN"},{"date":"2018-11-28","value":"CLOUDY"}]
             */

            private String status;
            private List<ComfortBean> comfort;
            private List<Skycon20h32hBean> skycon_20h_32h;
            private List<TemperatureBeanX> temperature;
            private List<DswrfBeanX> dswrf;
            private List<CloudrateBeanX> cloudrate;
            private List<AqiBeanX> aqi;
            private List<SkyconBeanX> skycon;
            private List<VisibilityBeanX> visibility;
            private List<HumidityBeanX> humidity;
            private List<AstroBean> astro;
            private List<ColdRiskBean> coldRisk;
            private List<UltravioletBean> ultraviolet;
            private List<PresBeanX> pres;
            private List<Pm25BeanX> pm25;
            private List<DressingBean> dressing;
            private List<CarWashingBean> carWashing;
            private List<PrecipitationBeanX> precipitation;
            private List<WindBeanX> wind;
            private List<Skycon08h20hBean> skycon_08h_20h;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<ComfortBean> getComfort() {
                return comfort;
            }

            public void setComfort(List<ComfortBean> comfort) {
                this.comfort = comfort;
            }

            public List<Skycon20h32hBean> getSkycon_20h_32h() {
                return skycon_20h_32h;
            }

            public void setSkycon_20h_32h(List<Skycon20h32hBean> skycon_20h_32h) {
                this.skycon_20h_32h = skycon_20h_32h;
            }

            public List<TemperatureBeanX> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBeanX> temperature) {
                this.temperature = temperature;
            }

            public List<DswrfBeanX> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfBeanX> dswrf) {
                this.dswrf = dswrf;
            }

            public List<CloudrateBeanX> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBeanX> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<AqiBeanX> getAqi() {
                return aqi;
            }

            public void setAqi(List<AqiBeanX> aqi) {
                this.aqi = aqi;
            }

            public List<SkyconBeanX> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBeanX> skycon) {
                this.skycon = skycon;
            }

            public List<VisibilityBeanX> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityBeanX> visibility) {
                this.visibility = visibility;
            }

            public List<HumidityBeanX> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBeanX> humidity) {
                this.humidity = humidity;
            }

            public List<AstroBean> getAstro() {
                return astro;
            }

            public void setAstro(List<AstroBean> astro) {
                this.astro = astro;
            }

            public List<ColdRiskBean> getColdRisk() {
                return coldRisk;
            }

            public void setColdRisk(List<ColdRiskBean> coldRisk) {
                this.coldRisk = coldRisk;
            }

            public List<UltravioletBean> getUltraviolet() {
                return ultraviolet;
            }

            public void setUltraviolet(List<UltravioletBean> ultraviolet) {
                this.ultraviolet = ultraviolet;
            }

            public List<PresBeanX> getPres() {
                return pres;
            }

            public void setPres(List<PresBeanX> pres) {
                this.pres = pres;
            }

            public List<Pm25BeanX> getPm25() {
                return pm25;
            }

            public void setPm25(List<Pm25BeanX> pm25) {
                this.pm25 = pm25;
            }

            public List<DressingBean> getDressing() {
                return dressing;
            }

            public void setDressing(List<DressingBean> dressing) {
                this.dressing = dressing;
            }

            public List<CarWashingBean> getCarWashing() {
                return carWashing;
            }

            public void setCarWashing(List<CarWashingBean> carWashing) {
                this.carWashing = carWashing;
            }

            public List<PrecipitationBeanX> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBeanX> precipitation) {
                this.precipitation = precipitation;
            }

            public List<WindBeanX> getWind() {
                return wind;
            }

            public void setWind(List<WindBeanX> wind) {
                this.wind = wind;
            }

            public List<Skycon08h20hBean> getSkycon_08h_20h() {
                return skycon_08h_20h;
            }

            public void setSkycon_08h_20h(List<Skycon08h20hBean> skycon_08h_20h) {
                this.skycon_08h_20h = skycon_08h_20h;
            }

            public static class ComfortBean {
                /**
                 * index : 4
                 * desc : 温暖
                 * datetime : 2018-11-24
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class Skycon20h32hBean {
                /**
                 * date : 2018-11-24
                 * value : PARTLY_CLOUDY_NIGHT
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class TemperatureBeanX {
                /**
                 * date : 2018-11-24
                 * max : 23
                 * avg : 19.5
                 * min : 19
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class DswrfBeanX {
                /**
                 * date : 2018-11-24
                 * max : 424.2
                 * avg : 25.9
                 * min : 0
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class CloudrateBeanX {
                /**
                 * date : 2018-11-24
                 * max : 0.86
                 * avg : 0.66
                 * min : 0.41
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class AqiBeanX {
                /**
                 * date : 2018-11-24
                 * max : 40
                 * avg : 24
                 * min : 9
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class SkyconBeanX {
                /**
                 * date : 2018-11-24
                 * value : PARTLY_CLOUDY_NIGHT
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class VisibilityBeanX {
                /**
                 * date : 2018-11-24
                 * max : 24.1
                 * avg : 22.3
                 * min : 9.7
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class HumidityBeanX {
                /**
                 * date : 2018-11-24
                 * max : 0.84
                 * avg : 0.79
                 * min : 0.77
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class AstroBean {
                /**
                 * date : 2018-11-24
                 * sunset : {"time":"17:03"}
                 * sunrise : {"time":"06:16"}
                 */

                private String date;
                private SunsetBean sunset;
                private SunriseBean sunrise;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public SunsetBean getSunset() {
                    return sunset;
                }

                public void setSunset(SunsetBean sunset) {
                    this.sunset = sunset;
                }

                public SunriseBean getSunrise() {
                    return sunrise;
                }

                public void setSunrise(SunriseBean sunrise) {
                    this.sunrise = sunrise;
                }

                public static class SunsetBean {
                    /**
                     * time : 17:03
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class SunriseBean {
                    /**
                     * time : 06:16
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }

            public static class ColdRiskBean {
                /**
                 * index : 3
                 * desc : 易发
                 * datetime : 2018-11-24
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class UltravioletBean {
                /**
                 * index : 2
                 * desc : 弱
                 * datetime : 2018-11-24
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class PresBeanX {
                /**
                 * date : 2018-11-24
                 * max : 100599.86
                 * avg : 100587.45
                 * min : 100310.2
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class Pm25BeanX {
                /**
                 * date : 2018-11-24
                 * max : 16
                 * avg : 14.25
                 * min : 2
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class DressingBean {
                /**
                 * index : 5
                 * desc : 凉爽
                 * datetime : 2018-11-24
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class CarWashingBean {
                /**
                 * index : 3
                 * desc : 较不适宜
                 * datetime : 2018-11-24
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class PrecipitationBeanX {
                /**
                 * date : 2018-11-24
                 * max : 0.1849
                 * avg : 0
                 * min : 0
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class WindBeanX {
                /**
                 * date : 2018-11-24
                 * max : {"direction":103.08,"speed":26.56}
                 * avg : {"direction":95.09,"speed":22.15}
                 * min : {"direction":81.66,"speed":19.59}
                 */

                private String date;
                private MaxBean max;
                private AvgBean avg;
                private MinBean min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public MaxBean getMax() {
                    return max;
                }

                public void setMax(MaxBean max) {
                    this.max = max;
                }

                public AvgBean getAvg() {
                    return avg;
                }

                public void setAvg(AvgBean avg) {
                    this.avg = avg;
                }

                public MinBean getMin() {
                    return min;
                }

                public void setMin(MinBean min) {
                    this.min = min;
                }

                public static class MaxBean {
                    /**
                     * direction : 103.08
                     * speed : 26.56
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }

                public static class AvgBean {
                    /**
                     * direction : 95.09
                     * speed : 22.15
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }

                public static class MinBean {
                    /**
                     * direction : 81.66
                     * speed : 19.59
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }
            }

            public static class Skycon08h20hBean {
                /**
                 * date : 2018-11-24
                 * value : RAIN
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
