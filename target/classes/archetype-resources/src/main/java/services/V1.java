package $package.services;

/**
 * V1 CSIP service...
 *
 */
import csip.ServiceException;
import javax.ws.rs.Path;
import static csip.annotations.State.*;
import csip.annotations.*;

@Name("conv #2")
@Description("Example of an simple service")
@Category("Examples")
@Category("Climate")
@Path("m/${artifactId}/1.0")
public class V1 extends csip.ModelDataService {

    @Override
    protected void doProcess() throws Exception {
        long sleep = getLongParam("sleep", 0);
        Thread.sleep(sleep);
        double temp = getDoubleParam("temp");
        String un = getParamUnit("temp");
        if (un.equals("C")) {
            putResult("temp", temp * 9 / 5 + 32, "temperature", "F");
            return;
        }
        throw new ServiceException("missing unit.");
    }
}

