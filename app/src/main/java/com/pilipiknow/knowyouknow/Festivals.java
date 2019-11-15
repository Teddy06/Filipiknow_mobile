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

public class Festivals extends AppCompatActivity {

    public static Festivals.MyAppAdapter myAppAdapter;
    public static Festivals.ViewHolder viewHolder;
    private ArrayList<Data> array;
    private SwipeFlingAdapterView flingContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivals);

        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);

        array = new ArrayList<>();
        array.add(new Data("https://i.pinimg.com/originals/5d/88/79/5d8879daaae6520cdd946815f8bb229c.jpg", "The Sinulog-Santo Niño Festival\n" + "is an annual cultural and religious festival held on the third Sunday of January in Cebu City \n" +
                "and is the centre of the Santo Niño Catholic celebrations in the Philippines. \n" +
                "The festival is considered to be first of most popular festivals in the Philippines, with every celebration of the festival routinely attracting around 1 to 2 million people from all over the Philippines every year.[1] Aside from the religious aspect of the festival, Sinulog is also famous for its street parties, usually happening at night before and at the night of the main festival."));
        array.add(new Data("https://i.pinimg.com/originals/4d/80/18/4d8018e207171dab69239864980cd31c.jpg", "Ati-Atihan \n" +
                "Kalibo, Aklan (Third week/Sunday of January)\n" +
                "Another celebration to honour the Santo Niño, Ati-Atihan is where people go to the streets parading their traditional costumes and weapons, and painting their bodies black. Participants march and dance in the town, matched with loud drumbeats. This festival will definitely make you dance your heart out while enjoying a true Filipino atmosphere."));
        array.add(new Data("https://lovepilipinas.com/wp-content/uploads/Dinagyang-Festival.jpg", "Dinagyang Festival  \n" +
                "Dinagyang is Iloilo City’s version of the Ati-Atihan Festival. While the festival in Kalibo, Aklan gets the most attention, the Dinagyang Festival in Iloilo City is equally deserving of its place on the Philippine calendar. The festival dates back to 1967 when a replica of the Señor Santo Niño was brought to Iloilo City from Cebu, and it has been called the Dinagyang Festival since 1977—Dinagyang being a term used to refer to “revelry” in the Ilonggo dialect. Today the festival includes tribal dance competitions, street parties, and firework displays."));
        array.add(new Data("https://philnewsph.com/wp-content/uploads/2017/01/Panagbenga-Festival-2017.jpg", "Panagbenga festival\n" +
                "Witness the colorful celebration of the annual flower festival parade in Baguio with a day tour at the Panagbenga Festival for P949 instead of P2500\n" +
                "Being the Summer Capital of the country, people usually come to Baguio to experience the chilly weather, and of course, the world-famous Panagbenga Festival every February, which is a month-long flower festival featuring a grand parade of floats made of flowers\n" +
                "Bask in the beauty of Baguio with a city tour and visit Burnham Park, Strawberry Farm, and The Mansion\n" +
                "Experience the festivity in convenience with round-trip bus transfers and an onboard tour guide throughout the trip\n" +
                "Enjoy your Baguio escapade to the fullest as this package is also inclusive of driver's fee, toll fees, and fuel charge\n" +
                "The tour also comes with a light snack and bottled water to keep you energized during the festivity."));
        array.add(new Data("https://4.bp.blogspot.com/-CTzg6pTdehM/WMi1wn8os3I/AAAAAAAACKU/Tsyl-atC-rMWl1BALiLxHlpHO1YKs66AwCPcB/s1600/Marinduque%2BMoriones%2BFestival_Holy%2BWeek.jpg", "Moriones Festival \n" +
                "The Moriones is a lenten rites held annually on Holy Week on the island of Marinduque, Philippines. The \"Moriones\" are men and women in costumes and masks replicating the garb of biblical Roman soldiers as interpreted by local folks. The Moriones or Moryonan tradition has inspired the creation of other festivals in the Philippines where cultural practices or folk history is turned into street festivals.It is a colorful festival celebrated on the island of Marinduque in the Philippines. The participants use morion masks to depict the Roman soldiers and Syrian mercenaries within the story of the Passion of the Christ. The mask was named after the 16th and 17th century Morion helmet.The Moriones refers to the masked and costumed penitents who march around the town for seven days searching for Longinus. Morions roam the streets in town from Holy Monday to Easter Sunday scaring the kids, or engaging in antics or surprises to draw attention. This is a folk-religious festival that re-enacts the story of Saint Longinus, a Roman centurion who was blind in one eye. The festival is characterized by colorful Roman costumes, painted masks and helmets, and brightly colored tunics. The towns of Boac, Gasan, Santa Cruz, Buenavista and Mogpog in the island of Marinduque become one gigantic stage. The observances form part of the Lenten celebrations of Marinduque. The various towns also hold the unique tradition of the pabasa or the recitation of Christ's passion in verse."));
        array.add(new Data("https://4.bp.blogspot.com/-4n_unfK-TBA/Vzm-CCU4l9I/AAAAAAAABbY/aVFHdiBeLOE7D1XlJ6rnsBsA-wXCyVnCgCLcB/s1600/Uncovering-Eden-Pahiyas-Festival-3.jpg", "Pahiyas Festival \n" +
                "May 15 is when the locals of Lucban decorate their houses extravagantly with vibrant and lively colours. Vegetables are hung as decorations because this festival celebrates the season of harvesting. People are allowed to bring their own basket and pick fresh vegetables from the walls, with no charge – happy fiesta and shopping at the same time!."));
        array.add(new Data("https://lovepilipinas.com/wp-content/uploads/2018/02/Pintados-Kasadyaan-Festival.jpg", "Pintados-Kasadayan Festival \n" +
                "Pintados-Kasadayan Festival is another religious celebration in the name of the Santo Niño held in Tacloban City. It showcases the rich culture and colourful history of the province of Leyte. The dancers paint their faces and bodies with vibrant colours of blue and green to depict Leyte’s ancestral people. Some dancers are also painted with designs that look like armour to represent the warriors that lived in Leyte long ago.\n" +
                "The folk dances they perform portray the many traditions people of Leyte practised before the Spanish era. Among these is the worship of idols, indigenous music, and epic stories, to name a few. The term, pintados, is derived from what the tattoed native warriors of Leyte were once called, while kasadayan means merriment in the Visayan tongue."));
        array.add(new Data("https://philippinescities.com/wp-content/uploads/2013/05/Baybay-City-Biliran-Festivals.jpg", "Sirong Festival \n" +
                "Surigao del Sur (August 15th)\n" +
                "Sirong Festival is another cultural and religious celebration. Various towns claim that it originated in their municipalities in Surigao del Sur. Most of these towns were founded during the pre-Spanish occupation and were attacked by the Moros. Sirong Festival features a war dance between the Muslims and the Christians. It marks the Christianisation of the early Cantilangnons. Whoever wins the best dance in the festival brings home a cash prize."));
        array.add(new Data("https://lifestyle.inquirer.net/241595/masskara-behind-the-masks/", "Masskara Festival \n" +
                "Bacolod City (October)\n" +
                "A festival that is celebrated from the city of smiles – Bacolod City. Mass (crowd) kara (face) Festival is filled with people wearing colourful smiling masks designed with feathers, flowers, and native beads. The festival allows tourists to enjoy 20 days of beer drinking, street dancing, and merrymaking. Every street is filled with locals wearing their smiling masks and festive costumes while dancing around and spreading the happy atmosphere throughout the city.\n" +
                "During the festival, locals are encouraged to forget the economic struggle brought about by the dead season of the sugar harvest. They also see the festival as their way of escapism and obscurantism. The sugar harvest is important to the people of Bacolod since Negros Occidental, where Bacolod is found, is known as the Sugar Bowl of the Philippines."));
        array.add(new Data("https://2.bp.blogspot.com/-2BQNA_6sMDU/XJL398ICjPI/AAAAAAAALwU/RT2nrIFUyO0jdC942ueKJU1WSPrLUu2UQCLcBGAs/s1600/kadayawan%2B2019.png", "Kadayawan Festival \n" +
                "The Kadayawan festival is celebrated every August. Indak-Indak sa Kadalanan ( Street Dancing)will showcase dance contingents from the different regions of Mindanao. A people's celebration and merriment through choreographed and theatrical street-dancing completion anchored on indigenous garbs and cultural performances while Pamulak sa Kadayawan (Floral Float Parade) will showcase of blooming and lush flora in a float parade and competition teeming with artistry as the floats impress the festival's theme and blessings of bounty which are the main highlights of the Kadayawan sa Dabaw Festival 2019. It showcased the different colors, cultures and traditional dances of the different tribes of Davao and Mindanao as they paraded along the city."));
        myAppAdapter = new Festivals.MyAppAdapter(array, Festivals.this);
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
                viewHolder = new Festivals.ViewHolder();
                viewHolder.DataText = (TextView) rowView.findViewById(R.id.bookText);
                viewHolder.background = (FrameLayout) rowView.findViewById(R.id.background);
                viewHolder.cardImage = (ImageView) rowView.findViewById(R.id.cardImage);
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (Festivals.ViewHolder) convertView.getTag();
            }
            viewHolder.DataText.setText(parkingList.get(position).getDescription() + "");

            Glide.with(Festivals.this).load(parkingList.get(position).getImagePath()).into(viewHolder.cardImage);

            return rowView;
        }
    }
}
