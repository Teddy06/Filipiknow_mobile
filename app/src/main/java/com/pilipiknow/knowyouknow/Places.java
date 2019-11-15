package com.pilipiknow.knowyouknow;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;

public class Places extends AppCompatActivity {

    public static Places.MyAppAdapter myAppAdapter;
    public static Places.ViewHolder viewHolder;
    private ArrayList<Data> array;
    private SwipeFlingAdapterView flingContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);

        array = new ArrayList<>();
        array.add(new Data("https://i.redd.it/a54w4j8n14z21.jpg", "Emilio Aguinaldo y Famy (1899–1901)\n" +
                "Spanish pronunciation: [eˈmi.ljo a.ɣiˈnal.do]: March 22, 1869 – February 6, 1964) was a Filipino revolutionary, politician and military leader who is officially recognized as the first and the youngest President of the Philippines (1899–1901) and first president of a constitutional republic in Asia. He led Philippine forces first against Spain in the latter part of the Philippine Revolution (1896–1898), and then in the Spanish–American War (1898), and finally against the United States during the Philippine–American War (1899–1901). \n" +
                "In 1935, Aguinaldo ran unsuccessfully for president of the Philippine Commonwealth against Manuel Quezon. He was also one of the Filipino historical figures to be recommended as a national hero of the Philippines.[13]."));
        array.add(new Data("https://i.redd.it/9viqqwkw77v11.jpg", "Manuel L. Quezon (1935–1944) \n" +
                "was a Filipino statesman, soldier and politician who served as president of the Commonwealth of the Philippines from 1935 to 1944. He was the first Filipino to head a government of the entire Philippines (as opposed to the government of previous Philippine states), and is considered to have been the second president of the Philippines, after Emilio Aguinaldo (1899–1901). \n" +
                "During his presidency, Quezon tackled the problem of landless peasants in the countryside. His other major decisions include the reorganization of the islands' military defense, approval of a recommendation for government reorganization, the promotion of settlement and development in Mindanao, dealing with the foreign stranglehold on Philippine trade and commerce, proposals for land reform, and opposing graft and corruption within the government. He established a government-in-exile in the U.S. with the outbreak of the war and the threat of Japanese invasion. \n" +
                "It was during his exile in the U.S. that he died of tuberculosis at Saranac Lake, New York. He was buried in the Arlington National Cemetery until the end of World War II, when his remains were moved to Manila. His final resting place is the Quezon Memorial Circle. \n" +
                "In 2015, the Board of the International Raoul Wallenberg Foundation approved a posthumously bestowal of the Wallenberg Medal upon President Quezon and to the people of the Philippines for having reached out, between 1937 and 1941, to the victims of the Holocaust. President Benigno Aquino III, and then-94-year-old María Zenaida Quezon Avanceña, who is the daughter of the former President, were informed about this recognition. ."));
        array.add(new Data("https://2.bp.blogspot.com/-rGTab4XCr7s/WxXyxOFpGlI/AAAAAAAAMKE/S2Nn0Wss8DUMN4iovTukYc4ySzaYNWC4wCLcBGAs/s1600/talambuhay-ng-mga-pangulo-ng-pilipinas-jose-p-laurel.jpg", "José P. Laurel (1943–1945) \n" +
                "(March 9, 1891 – November 6, 1959) was a Filipino politician and judge. He was the president of the Second Philippine Republic, a Japanese puppet state when occupied during World War II, from 1943 to 1945. Since the administration of President Diosdado Macapagal (1961–1965), Laurel has been officially recognized by later administrations as a former president of the Philippines. "));
        array.add(new Data("https://zimy315.files.wordpress.com/2014/01/quezon-w960-216x30011.jpg", "Sergio Osmeña Sr. (1944–1946) \n" +
                " 9 September 1878 – 19 October 1961) was a Filipino politician who served as the fourth President of the Philippines from 1944 to 1946. He was Vice President under Manuel L. Quezon. Upon Quezon's sudden death in 1944, Osmeña succeeded him, at age 65, becoming the oldest holder of the office (a record he held until 71-year-old Rodrigo Duterte was elected in 2016). A founder of the Nacionalista Party, Osmeña was also the first Visayan to become president. \n" +
                "Prior to his accession in 1944, Osmeña served as Governor of Cebu from 1906 to 1907, Member and first Speaker of the Philippine House of Representatives from 1907 to 1922, and Senator from the 10th Senatorial District for thirteen years, in which capacity he served as Senate President pro tempore. In 1935, he was nominated to be the running-mate of Senate President Manuel L. Quezon for the presidential election that year. The duo were overwhelmingly re-elected in 1941. \n" +
                "He was the patriarch of the prominent Osmeña family, which includes his son, former Senator Sergio Osmeña Jr., and his grandsons, senators Sergio Osmeña III and John Henry Osmeña, ex-governor Lito Osmeña and Cebu City mayor Tomas Osmeña. ."));
        array.add(new Data("https://backgrounddownload.com/wp-content/uploads/2018/09/manuel-roxas-educational-background-5.jpg", "Manuel Roxas (1946-1948) \n" +
                "January 1, 1892 – April 15, 1948) was the fifth President of the Philippines who served from 1946 until his death in 1948. He briefly served as the third and last President of the Commonwealth of the Philippines from May 28, 1946 to July 4, 1946 and then became the first President of the independent Third Philippine Republic after the United States ceded its sovereignty over the Philippines. \n" +
                "His son, Gerardo (\"Gerry\"), became a member of the Philippine House of Representatives and a leader of Liberal Party of the Philippines. Gerry's sons, Manuel II (\"Mar\") and Gerardo, Jr. (\"Dinggoy\"), served as representatives from Capiz. In 2004, Mar became a Senator and was also elected president of the Liberal Party. His daughter-in-law, Judy Araneta (widow of Gerry), continues to be a prominent and driving force of the Liberal Party. "));
        array.add(new Data("http://www.canadianinquirer.net/wp-content/uploads/2016/02/Quirino-w960-216x3001.jpg", "Elpidio Quirino (1948–1953) \n" +
                "November 16, 1890 – February 29, 1956) was a Filipino politician of ethnic Ilocano descent who served as the sixth President of the Philippines from 1948 to 1953. \n" +
                "A lawyer by profession, Quiríno entered politics when he became a representative of Ilocos Sur from 1919 to 1925. He was then elected as senator from 1925–1931. In 1934, he became a member of the Philippine independence commission that was sent to Washington, D.C., which secured the passage of Tydings–McDuffie Act to American Congress. In 1935, he was also elected to the convention that drafted the 1935 constitution for the newly established Commonwealth. In the new government, he served as secretary of the interior and finance under President Manuel Quezon's cabinet. \n" +
                "After World War II, Quiríno was elected vice-president in the 1946 election, consequently the second and last for the Commonwealth and first for the third republic. After the death of the incumbent president Manuel Roxas in 1948, he succeeded the presidency. He won the president's office under Liberal Party ticket, defeating Nacionalista vice president and former president José P. Laurel as well as fellow Liberalista and former Senate President José Avelino. \n" +
                "The Quiríno administration was generally challenged by the Hukbalahaps, who ransacked towns and barrios. Quiríno ran for president again in 1953 but was defeated by Ramon Magsaysay. "));
        array.add(new Data("https://i.redd.it/k50baj78fsj31.jpg", "Ramon Magsaysay (1953–1957) \n" +
                "(August 31, 1907 – March 17, 1957) was a Filipino statesman who served as the seventh President of the Philippines, from December 30, 1953 until his death in an aircraft disaster. An automobile mechanic by profession, Magsaysay was appointed military governor of Zambales after his outstanding service as a guerilla leader during the Pacific War. He then served two terms as Liberal Party congressman for Zambales before being appointed as Secretary of National Defense by President Elpidio Quirino. He was elected president under the banner of the Nacionalista Party. \n" +
                "He was the first Philippine president born during the 20th century and the first to be born after the Spanish colonial era. "));
        array.add(new Data("https://en.wikipedia.org/wiki/Carlos_P._Garcia#/media/File:Carlos_P_Garcia_photo.jpg", "Carlos P. Garcia (1957–1961) \n" +
                "Carlos Polestico García (November 4, 1896 – June 14, 1971) was a Filipino teacher, poet, orator, lawyer, public official, political economist, organized guerrilla and Commonwealth military leader, who was the eighth President of the Philippines. "));
        array.add(new Data("https://en.wikipedia.org/wiki/Diosdado_Macapagal#/media/File:Diosdado_Macapagal_USS_Oklahoma_City_1962_cropped.jpg", "Diosdado Macapagal (1961–1965) \n" +
                "September 28, 1910 – April 21, 1997) was the ninth President of the Philippines, serving from 1961 to 1965, and the sixth Vice-President, serving from 1957 to 1961. He also served as a member of the House of Representatives, and headed the Constitutional Convention of 1970. He was the father of Gloria Macapagal Arroyo, who followed his path as President of the Philippines from 2001 to 2010. \n" +
                "A native of Lubao, Pampanga, Macapagal graduated from the University of the Philippines and University of Santo Tomas, both in Manila, after which he worked as a lawyer for the government. He first won election in 1949 to the House of Representatives, representing a district in his home province of Pampanga. In 1957, he became vice president under the rule of President Carlos P. Garcia, whom he later defeated in the 1961 election.  "));
        array.add(new Data("https://i.redd.it/luztz5lv72e11.jpg", "Ferdinand Marcos (1965–1986) \n" +
                "(September 11, 1917 – September 28, 1989) was a Filipino politician and kleptocrat[3][4][5][6][7][8][9] who was the tenth President of the Philippines from 1965 to 1986.[10] A leading member of the far-right New Society Movement, he ruled as a dictator[4][11][12][13] under martial law from 1972 until 1981.[14] His regime was infamous for its corruption,[15][16][17][18] extravagance,[19][20][21] and brutality.[22][23][24] \n" +
                "Marcos claimed an active part in World War II, including fighting alongside the Americans in the Bataan Death March and being the \"most decorated war hero in the Philippines\".[25] A number of his claims were found to be false[26][27][28][29][30] and the United States Army documents described Marcos's wartime claims as \"fraudulent\" and \"absurd\".[31]"));
        array.add(new Data("https://i.redd.it/i9vm694t7e531.jpg", "Corazon Aquino (1986–1992) \n" +
                "(25 January 1933 – 1 August 2009) was a Filipino politician who served as the 11th President of the Philippines, becoming the first woman to hold that office. Corazon Aquino was the most prominent figure of the 1986 People Power Revolution, which ended the 21-year rule of President Ferdinand Marcos. She was named Time magazine's Woman of the Year in 1986. Prior to this, she had not held any elective office. \n" +
                "A self-proclaimed \"plain housewife\",[3] she was married to Senator Benigno Aquino Jr., the staunchest critic of President Marcos. She emerged as leader of the opposition after her husband was assassinated on 21 August 1983 upon returning to the Philippines from exile in the United States. In late 1985, Marcos called for snap elections, and Aquino ran for president with former senator Salvador Laurel as her running mate for vice president. After the elections were held on 7 February 1986, the Batasang Pambansa proclaimed Marcos and his running mate Arturo Tolentino as the winners; allegations were made of electoral fraud, with Aquino calling for massive civil disobedience actions. Defections from the Armed Forces of the Philippines and the support of the local Catholic hierarchy led to the People Power Revolution that ousted Marcos and secured Aquino's accession on 25 February 1986.  "));
        array.add(new Data("https://northwatch.files.wordpress.com/2012/03/fidel-ramos-headshot.jpg", "Fidel V. Ramos (1992–1998) \n" +
                "March 18, 1928),[2] popularly known as FVR and Eddie, is a retired Filipino general and politician who served as the 12th President of the Philippines from 1992 to 1998. During his six years in office, Ramos was widely credited and admired by many for revitalizing and renewing international confidence in the Philippine economy. At age 91, he is currently the oldest living former Philippine President. \n" +
                "He rose to ranks in the Philippine military early in his career and became Chief of the Philippine Constabulary and Vice-Chief-of-Staff of the Armed Forces of the Philippines during the term of President Ferdinand Marcos. \n" +
                "During the 1986 EDSA People Power Revolution, Ramos was hailed as a hero by many Filipinos for his decision to break away from the administration of President Marcos and pledge allegiance and loyalty to the newly-established government of President Corazon Aquino. \n" +
                "Prior to his election as president, Ramos served in the cabinet of President Corazón Aquino, first as chief-of-staff of the Armed Forces of the Philippines (AFP), and later as Secretary of National Defense from 1986 to 1991.[3] He was credited for the creation of the Philippine Army's Special Forces and the Philippine National Police Special Action Force.  "));
        array.add(new Data("https://i.redd.it/1j68gwd8tqbx.jpg", "Joseph Estrada (1998–2001) \n" +
                "April 19, 1937) is a Filipino politician and former actor who served as the 13th President of the Philippines from 1998 to 2001, ninth Vice President of the Philippines from 1992 to 1998, and the 26th Mayor of the City of Manila, the country's capital,[1] from 2013 to 2019. In 2001, he became the first president in Asia to be impeached from an executive role and resigned from power. \n" +
                "Estrada gained popularity as a film actor, playing the lead role in over a hundred films in an acting career spanning some three decades, and model, who was started as a fashion and ramp model at the age of 13. He used his popularity as an actor to make gains in politics, serving as Mayor of San Juan from 1969 to 1986, as Senator from 1987 to 1992, then as Vice-President under President Fidel V. Ramos from 1992 to 1998.  "));
        array.add(new Data("https://i.redd.it/zbvdb14z9oe21.jpg", "Gloria Macapagal Arroyo (2001–2009) \n" +
                "(born April 5, 1947)[3] is a Filipino professor and politician who was the 14th President of the Philippines from 2001 until 2010. She recently held the position of the Speaker of the House of Representatives of the Philippines, making her the first woman to hold the position from 2018 until 2019 before her retirement.[4] \n" +
                "Arroyo studied Economics at Georgetown University at Washington DC where she began a lasting friendly relationship with classmate and future U.S president Bill Clinton.[5] Born as the daughter of President Diosdado Macapagal, Arroyo is a former professor of economics at Ateneo de Manila University where her eventual successor President Benigno Aquino III was one of her students. She entered government in 1987, serving as assistant secretary and undersecretary of the Department of Trade and Industry upon the invitation of President Corazon Aquino, Benigno's mother. After serving as a senator from 1992 to 1998, she was elected to the vice presidency under President Joseph Estrada, despite having run on an opposing ticket. "));
        array.add(new Data("https://i.redd.it/rcum9buuieu11.jpg", "Benigno Aquino III (2010–2016) \n" +
                "(born February 8, 1960) is a Filipino politician who served as the 15th President of the Philippines from 2010 until 2016.[4][5][6] Aquino is a fourth-generation politician and the chairman of the Liberal Party from 2010 to 2016. \n" +
                "On September 9, 2009, shortly after the death of his mother, Aquino officially announced that he would be a candidate in the 2010 presidential election. He was elected and on June 30, 2010 was sworn into office as the fifteenth President of the Philippines at the Quirino Grandstand in Rizal Park, Manila,[4][7] succeeding Gloria Macapagal-Arroyo. He ended his term on June 30, 2016, succeeded by Rodrigo Duterte. \n" +
                "In 2013, Time named him one of the 100 Most Influential People in the World.[8] "));
        array.add(new Data("http://tokyo.philembassy.net/wp-content/uploads/2016/08/PRRD-PORTRAIT.jpg", "Rodrigo R. Duterte (2016–2022) \n" +
                " born March 28, 1945), also known as Digong and Rody,[5] is a Filipino politician who is the 16th and current President of the Philippines and the first from Mindanao to hold the office.[6][7][8][9] He is the chair of the ruling PDP–Laban party. Taking office at 71 years old in June 2016, Duterte is the oldest person to assume the Philippine presidency; the record was previously held by Sergio Osmeña at the age of 65.[10] \n" +
                "Born in Maasin, Southern Leyte, Duterte studied political science at the Lyceum of the Philippines University, graduating in 1968, before obtaining a law degree from San Beda College of Law in 1972. He then worked as a lawyer and was a prosecutor for Davao City, before becoming vice mayor and, subsequently, mayor of the city in the wake of the Philippine Revolution of 1986. Duterte was among the longest-serving mayors in the Philippines, serving seven terms for a span of more than 22 years in office. "));

        myAppAdapter = new Places.MyAppAdapter(array, Places.this);
        flingContainer.setAdapter(myAppAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {

            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                array.remove(0);
                myAppAdapter.notifyDataSetChanged();
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
            }

            @Override
            public void onRightCardExit(Object dataObject) {

                array.remove(0);
                myAppAdapter.notifyDataSetChanged();
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {

            }

            @Override
            public void onScroll(float scrollProgressPercent) {

                View view = flingContainer.getSelectedView();
                view.findViewById(R.id.background).setAlpha(0);
                view.findViewById(R.id.item_swipe_right_indicator).setAlpha(scrollProgressPercent < 0 ? -scrollProgressPercent : 0);
                view.findViewById(R.id.item_swipe_left_indicator).setAlpha(scrollProgressPercent > 0 ? scrollProgressPercent : 0);
            }
        });


        // Optionally add an OnItemClickListener
        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
            @Override
            public void onItemClicked(int itemPosition, Object dataObject) {

                View view = flingContainer.getSelectedView();
                view.findViewById(R.id.background).setAlpha(0);

                myAppAdapter.notifyDataSetChanged();
            }
        });
    }

    public static class ViewHolder {
        public static FrameLayout background;
        public TextView DataText;
        public ImageView cardImage;


    }

    public class MyAppAdapter extends BaseAdapter {


        public List<Data> parkingList;
        public Context context;

        private MyAppAdapter(List<Data> apps, Context context) {
            this.parkingList = apps;
            this.context = context;
        }

        @Override
        public int getCount() {
            return parkingList.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;


            if (rowView == null) {

                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.item, parent, false);
                // configure view holder
                viewHolder = new Places.ViewHolder();
                viewHolder.DataText = (TextView) rowView.findViewById(R.id.bookText);
                viewHolder.background = (FrameLayout) rowView.findViewById(R.id.background);
                viewHolder.cardImage = (ImageView) rowView.findViewById(R.id.cardImage);
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (Places.ViewHolder) convertView.getTag();
            }
            viewHolder.DataText.setText(parkingList.get(position).getDescription() + "");

            Glide.with(Places.this).load(parkingList.get(position).getImagePath()).into(viewHolder.cardImage);

            return rowView;
        }
    }
}
