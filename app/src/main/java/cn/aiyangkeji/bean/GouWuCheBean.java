package cn.aiyangkeji.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gaoweiwei on 15/6/4.
 */
public class GouWuCheBean extends BaseBean{
    public List<Value> data;
    public static class Value implements Serializable {
       public int contactId;
        public int customerId;
        public String name;
        public String  mobile;
        public String province;
        public String city;
        public int number;
        public String price;
        public String address;
        public String createTime;
        public int isdefault;
        public int status;
        public List<GouWuCheBean.Type>type;
        public String types;
    }
    public static class Type  implements Serializable{

        public String typeValue;
        public int statusCode;
    }
}
