
package projectqa.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

@RequestTemplatePath(path = "api/user/post/rq.json")
@ResponseTemplatePath(path = "api/user/post/rs.json")
@Endpoint(methodType = HttpMethodType.POST, url = "https://reqres.in/api/users")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostUserMethod extends AbstractApiMethodV2 {

    public PostUserMethod(){
     super();
     setProperties("api/user/post/user.properties");

    }



}
