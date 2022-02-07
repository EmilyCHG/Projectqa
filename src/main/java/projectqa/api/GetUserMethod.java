package projectqa.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

@ResponseTemplatePath(path = "api/user/get/rs.json")
@Endpoint(methodType = HttpMethodType.GET, url = "https://jsonplaceholder.typicode.com/todos")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUserMethod extends AbstractApiMethodV2 {

    public GetUserMethod(){
        super();
    }
}
