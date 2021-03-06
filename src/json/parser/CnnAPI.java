package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import databases.ConnectToSqlDB;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=82b3b1dd34d249328c7cd9a488887f0b

      MY_API_KEY=82b3b1dd34d249328c7cd9a488887f0b
      jason data: {"status":"ok","totalResults":10,"articles":[{"source":{"id":"cnn","name":"CNN"},"author":null,"title":"Corker fires back at Trump on Twitter - CNN Video","description":"Sen. Bob Corker (R-TN) criticizes President Trump on Twitter after Trump slammed Corker for his criticism of the partial federal government shutdown.","url":"http://us.cnn.com/videos/politics/2018/12/24/bob-corker-tweet-daycare-staff-trump-nr-vpx.cnn","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181206143152-bob-corker-trump-khashoggi-unamerican-crn-vpx-00000000-super-tease.jpg","publishedAt":"2018-12-24T01:52:48.873182Z","content":"Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."},{"source":{"id":"cnn","name":"CNN"},"author":null,"title":"Right-wing personalities pulling Trump's strings? - CNN Video","description":"Sarah Ellison, Douglas Brinkley, and Ben Smith discuss how criticism from conservative pundits shaped Trump's decision to force a government shutdown. \"Anytime Ann Coulter criticizes him, he withers,\" Brinkley says.","url":"http://us.cnn.com/videos/media/2018/12/23/right-wing-personalities-pulling-trumps-strings-rs.cnn","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181114120712-01-ann-coulter-1020-super-tease.jpg","publishedAt":"2018-12-24T00:23:04.8459573Z","content":null},{"source":{"id":"cnn","name":"CNN"},"author":null,"title":"Stelter: This is the as-seen-on TV presidency - CNN Video","description":"With the NYT reporting that Trump is spending \"ever more time in front of a television,\" Brian Stelter says we're witnessing a presidency shaped by TV in every way, right down to the people Trump hires and fires. Stelter shows examples of how Trump is the \"mi…","url":"http://us.cnn.com/videos/media/2018/12/23/stelter-this-is-the-as-seen-on-tv-presidency-rs.cnn","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181223154517-stelter-this-is-the-as-seen-on-tv-presidency-rs-00010107-super-tease.jpg","publishedAt":"2018-12-24T00:22:47.5022738Z","content":null},{"source":{"id":"cnn","name":"CNN"},"author":"Barbara Starr, CNN Pentagon Correspondent","title":"Order to withdraw US forces from Syria signed","description":"The order to withdraw US forces from Syria has been signed.","url":"http://us.cnn.com/2018/12/23/politics/syria-withdrawal-pentagon-signed-order/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181219091812-01-us-troops-syria-file-super-tease.jpg","publishedAt":"2018-12-23T22:42:41Z","content":null},{"source":{"id":"cnn","name":"CNN"},"author":"Analysis by Brian Stelter, CNN Business","title":"Behind Trump's as-seen-on-TV presidency","description":"This is an awfully chaotic end to year two of the as-seen-on-TV presidency.","url":"http://us.cnn.com/2018/12/23/media/donald-trump-stelter-television-presidency/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181221114216-trump-hannity-super-tease.jpg","publishedAt":"2018-12-23T22:14:38Z","content":null},{"source":{"id":"cnn","name":"CNN"},"author":"Jeremy Diamond and Elise Labott, CNN","title":"Trump told Turkey's Erdogan in Dec. 14 call about Syria, 'it's all yours. We are done'","description":"US President Donald Trump and Turkish President Recep Tayyip Erdogan discussed the possible withdrawal of US forces from Syria ahead of Trump's announcement of the move on Wednesday.","url":"http://us.cnn.com/2018/12/23/politics/donald-trump-erdogan-turkey/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/170207195854-erdogan-trump-split-super-tease.jpg","publishedAt":"2018-12-23T21:34:48Z","content":"I just had a long and productive call with President @RT_Erdogan of Turkey. We discussed ISIS, our mutual involvement in Syria, &amp; the slow &amp; highly coordinated pullout of U.S. troops from the area. After many years they are coming home. We also discus… [+81 chars]"},{"source":{"id":"cnn","name":"CNN"},"author":"Peter Bergen, CNN National Security Analyst","title":"The man who said Emperor Trump has no clothes","description":"Few who work at senior levels in the administration of President Donald Trump leave with their reputations unsullied. James Mattis is one of the few, Peter Bergen writes.","url":"http://us.cnn.com/2018/12/23/opinions/the-man-who-said-emperor-trump-has-no-clothes-mattis-bergen/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181221085713-03-trump-mattis-lead-image-super-tease.jpg","publishedAt":"2018-12-23T18:40:23Z","content":"Peter Bergen is CNN's national security analyst, a vice president at New America, and a professor of practice at Arizona State University. He is writing a book for Penguin/Random House about the Trump administration's national security team and its policies. … [+13758 chars]"},{"source":{"id":"cnn","name":"CNN"},"author":"Eli Watkins and Barbara Starr, CNN","title":"Trump says Mattis to leave by end of year, announces new acting secretary of defense","description":"President Donald Trump announced on Sunday he would replace Defense Secretary James Mattis at the start of the new year,  two months earlier than Mattis' planned departure.","url":"http://us.cnn.com/2018/12/23/politics/james-mattis-trump-shanahan/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181221085443-01-trump-mattis-lead-image-super-tease.jpg","publishedAt":"2018-12-23T17:19:42Z","content":"I am pleased to announce that our very talented Deputy Secretary of Defense, Patrick Shanahan, will assume the title of Acting Secretary of Defense starting January 1, 2019. Patrick has a long list of accomplishments while serving as Deputy, &amp; previously … [+79 chars]"},{"source":{"id":"cnn","name":"CNN"},"author":"Devan Cole, CNN","title":"Beto O'Rourke: 'What's happening now is part of a larger threat to us all'","description":"Outgoing Democratic Rep. Beto O'Rourke issued a pointed warning about what he sees as the threat President Donald Trump poses to American democracy, writing that \"what's happening now is part of a larger threat to us all.\"","url":"http://us.cnn.com/2018/12/23/politics/beto-orourke-shutdown-statement/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181107022743-beto-orourke-election-night-nov-6-super-tease.jpg","publishedAt":"2018-12-23T15:42:30Z","content":"(CNN) Outgoing Democratic Rep. Beto O'Rourke issued a pointed warning about what he sees as the threat President Donald Trump poses to American democracy, writing that \"what's happening now is part of a larger threat to us all.\" In a statement sent to support… [+2471 chars]"},{"source":{"id":"cnn","name":"CNN"},"author":"Analysis by Chris Cillizza, CNN Editor-at-large","title":"The reality TV president just got beat at his own game","description":"The best way to understand Donald Trump's approach to the presidency is to think of him as what he was before politics: The star and producer of a reality TV show. Trump is forever programming the show -- aka his White House and the country -- in ways he thin…","url":"http://us.cnn.com/2018/12/11/politics/donald-trump-nancy-pelosi-chuck-schumer/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181211121922-02-trump-pelosi-schumer-1211-super-tease.jpg","publishedAt":"2018-12-11T21:54:45Z","content":"THE POINT -- NOW ON YOUTUBE! In each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"}]}

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */
    public static void main(String[] args) throws Exception {


        List<String> listofid = new ArrayList();
        List<String> listofname = new ArrayList();
        List<String> listofa = new ArrayList();
        List<String> listoft = new ArrayList();
        List<String> listofdes = new ArrayList();
        List<String> listofurl = new ArrayList();
        List<String> listofurlm = new ArrayList();
        List<String> listofpub = new ArrayList();
        List<String> listofcon = new ArrayList();
        Map<String, List<String>> map = new HashMap<>();


        try {
            URL sUrl = new URL("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=3a953102a1d7462f80e0e8572592afdd");
            URLConnection request = sUrl.openConnection();
            request.connect();

            JsonParser jsonParser = new JsonParser();
            JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));

            JsonObject jsonObject = new JsonObject();
            jsonObject.add("articles", root);

            JsonArray jsonArray = new JsonArray();
            jsonArray.add(root.getAsJsonObject().get("articles"));


            for (int k = 0; k < jsonArray.get(0).getAsJsonArray().size(); k++) {


                JsonObject jsonobject = jsonArray.get(0).getAsJsonArray().get(k).getAsJsonObject();


                String id = jsonobject.get("source").getAsJsonObject().get("id").toString();
                System.out.print(id);
                listofid.add(id);

                String name = jsonobject.get("source").getAsJsonObject().get("name").toString();
                System.out.print(name);
                listofname.add(name);

                String a = jsonobject.get("author").toString();
                System.out.print(a);
                listofa.add(a);
                String t = jsonobject.get("title").toString();
                System.out.print(t);
                listoft.add(t);
                String des = jsonobject.get("description").toString();
                System.out.print(des);
                listofdes.add(des);
                String url = jsonobject.get("url").toString();
                System.out.print(url);
                listofurl.add(url);
                String urlm = jsonobject.get("urlToImage").toString();
                System.out.print(urlm);
                listofurlm.add(urlm);
                String pub = jsonobject.get("publishedAt").toString();
                System.out.print(pub);
                listofpub.add(pub);
                String con = jsonobject.get("content").toString();
                System.out.print(con);
                listofcon.add(con);
                System.out.println();
                map.put("all_id", listofid);
                map.put("all_name", listofname);
                map.put("all_author", listofa);
                map.put("all_title", listoft);
                map.put("all_description", listofdes);
                map.put("all_url", listofurl);
                map.put("all_urlImage", listofurlm);
                map.put("all_publication", listofpub);
                map.put("all_content", listofcon);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        List l1 = listofid;
        List l2 = listofname;
        List l3 = listofa;
        List l4 = listoft;
        List l5 = listofdes;
        List l6 = listofurl;
        List l7 = listofurlm;
        List l8 = listofpub;
        List l9 = listofcon;
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
// Inserting Data into MySql
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l1, "tab", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l2, "tab1", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l3, "tab2", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l4, "tab3", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l5, "tab4", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l6, "tab5", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l7, "tab6", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l8, "tab7", "col");
        connectToSqlDB.insertDataFromArrayListToSqlTableforString(l9, "tab8", "col");
// Reading data from MySql
        System.out.println(connectToSqlDB.readDataBase("tab", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab1", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab2", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab3", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab4", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab5", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab6", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab7", "col"));
        System.out.println(connectToSqlDB.readDataBase("tab8", "col"));
    }


}
