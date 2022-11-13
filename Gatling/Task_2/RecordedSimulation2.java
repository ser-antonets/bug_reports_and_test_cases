
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulation2 extends Simulation {

  {
    int min = 1;
    int max = 10;

    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://challenge.flood.io")
      .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*detectportal\\.firefox\\.com.*"))
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_0.put("accept-encoding", "gzip, deflate, br");
    headers_0.put("accept-language", "en-US,en;q=0.9,uk;q=0.8");
    headers_0.put("sec-ch-ua", "Google Chrome\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24");
    headers_0.put("sec-ch-ua-mobile", "?1");
    headers_0.put("sec-ch-ua-platform", "Android");
    headers_0.put("sec-fetch-dest", "document");
    headers_0.put("sec-fetch-mode", "navigate");
    headers_0.put("sec-fetch-site", "none");
    headers_0.put("sec-fetch-user", "?1");
    headers_0.put("upgrade-insecure-requests", "1");
    headers_0.put("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Mobile Safari/537.36");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("accept", "text/html, application/xhtml+xml");
    headers_2.put("accept-encoding", "gzip, deflate, br");
    headers_2.put("accept-language", "en-US,en;q=0.9,uk;q=0.8");
    headers_2.put("sec-ch-ua", "Google Chrome\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24");
    headers_2.put("sec-ch-ua-mobile", "?1");
    headers_2.put("sec-ch-ua-platform", "Android");
    headers_2.put("sec-fetch-dest", "empty");
    headers_2.put("sec-fetch-mode", "cors");
    headers_2.put("sec-fetch-site", "same-origin");
    headers_2.put("turbolinks-referrer", "https://challenge.flood.io/");
    headers_2.put("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Mobile Safari/537.36");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_3.put("accept-encoding", "gzip, deflate, br");
    headers_3.put("accept-language", "en-US,en;q=0.9,uk;q=0.8");
    headers_3.put("origin", "https://challenge.flood.io");
    headers_3.put("sec-ch-ua", "Google Chrome\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24");
    headers_3.put("sec-ch-ua-mobile", "?1");
    headers_3.put("sec-ch-ua-platform", "Android");
    headers_3.put("sec-fetch-dest", "document");
    headers_3.put("sec-fetch-mode", "navigate");
    headers_3.put("sec-fetch-site", "same-origin");
    headers_3.put("sec-fetch-user", "?1");
    headers_3.put("upgrade-insecure-requests", "1");
    headers_3.put("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Mobile Safari/537.36");
    
    String uri2 = "https://fonts.googleapis.com/css";

    ScenarioBuilder scn;
    scn = scenario("RecordedSimulation2")
      .exec(
        http("GET Google Font")
          .get("/")
          .headers(headers_0)
          .resources(
            http("GET Font Famaly")
              .get(uri2 + "?family=Lobster|Lobster+Two")
          )
      )
      .pause(min, max)
      .exec(
        http("GET Home Page")
          .get("/")
          .headers(headers_2)
      )
      .pause(min, max)
      .exec(
        http("POST Start Test")
          .post("/start")
                .check(status()
                        .is(session ->
                        200 + java.util.concurrent.ThreadLocalRandom.current().nextInt(2)
                ))

          .headers(headers_3)
          .formParam("utf8", "✓")
          .formParam("authenticity_token", "XVBDa0yJDFa4d+qpngrOREtqqb2aroYssVYjO6GNsZo=")
          .formParam("challenger[step_id]", "UWRyK0lYTW5oVGE0cHZ4WXNhRXU2QT09LS1OV283TEpSUlpKaDNqZHRDQndBQS93PT0=--52568a7dede78db7d94a744cf6bd86a11d35349d")
          .formParam("challenger[step_number]", "1")
          .formParam("commit", "Start")
      )
      .pause(min, max)
      .exec(
        http("POST Select Age")
          .post("/start")
                .check(status()
                        .is(session ->
                                200 + java.util.concurrent.ThreadLocalRandom.current().nextInt(2)
                        ))
          .headers(headers_3)
          .formParam("utf8", "✓")
          .formParam("authenticity_token", "XVBDa0yJDFa4d+qpngrOREtqqb2aroYssVYjO6GNsZo=")
          .formParam("challenger[step_id]", "VmhYUU5HRjR0ZEhpT3psbndBTVZZQT09LS1IMGpNTFgvdDJub0FLOXBhcHZ5TmN3PT0=--1f1d253750f7ccdacb24a0ae347d8236191febd3")
          .formParam("challenger[step_number]", "2")
          .formParam("challenger[age]", "27")
          .formParam("commit", "Next")
      )
      .pause(min, max)
      .exec(
        http("POST Value")
          .post("/start")
                .check(status()
                        .is(session ->
                                200 + java.util.concurrent.ThreadLocalRandom.current().nextInt(2)
                        ))
          .headers(headers_3)
          .formParam("utf8", "✓")
          .formParam("authenticity_token", "XVBDa0yJDFa4d+qpngrOREtqqb2aroYssVYjO6GNsZo=")
          .formParam("challenger[step_id]", "QndxSERiQ1hWdFlXUjkyOTNsZ3FvZz09LS0rRzE5S3F5djJad0Zvc1lNQVRvMTN3PT0=--bc5d5f087401239210df467f851aa28b0bce4174")
          .formParam("challenger[step_number]", "3")
          .formParam("challenger[largest_order]", "")
          .formParam("challenger[order_selected]", "Z0NWTEtPdkdjczVXQmZZR3JqMHd6dz09LS1TcXJxSzV3dTV5aGc2Z3VSeE1rcGdRPT0=--1387feceecc5c7d3aff887149bf058f0e3ca2ae0")
          .formParam("commit", "Next")
      );

    setUp(scn.injectOpen(rampUsers(10).during(10))).protocols(httpProtocol);
  }
}
