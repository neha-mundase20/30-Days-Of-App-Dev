package com.example.listviewimplementation

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ListViewAdapter(val context: Activity, val arrayList: ArrayList<userData>):ArrayAdapter<userData>(context,R.layout.card_layout,arrayList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.card_layout,null)

        val itemName=view.findViewById<TextView>(R.id.itemText)
        val description=view.findViewById<TextView>(R.id.itemDescription)
        val image=view.findViewById<CircleImageView>(R.id.profile_image)

        itemName.text=arrayList[position].itemText
        description.text=arrayList[position].description
        image.setBackgroundResource(arrayList[position].imageId)

        return view
    }
}

/*In Android development, a ListViewAdapter is responsible for providing data to a ListView and creating views for each item in the list.
 The ListView is a commonly used UI component that displays a scrollable list of items.

Let's break down the code step by step:

kotlin
Copy code
class ListViewAdapter(val context: Activity, val arrayList: ArrayList<userData>): ArrayAdapter<userData>(context, R.layout.card_layout, arrayList) {
    Here, we define the ListViewAdapter class. It takes two parameters: context and arrayList.
    context refers to the activity or context in which the adapter is being used, and arrayList is an ArrayList that contains data to be displayed in the ListView.
     The ListViewAdapter class extends the ArrayAdapter class, which is a built-in adapter provided by Android for working with arrays or lists of data.

    kotlin
    Copy code
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        This method, getView(), is an override of the same method defined in the ArrayAdapter class.
         It is called for each item in the ListView to create and return the corresponding view.

        kotlin
        Copy code
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.card_layout, null)
        Here, we obtain an instance of the LayoutInflater class, which is used to inflate the XML layout file (R.layout.card_layout) into a corresponding view object.
         The card_layout refers to the layout file that defines the appearance of each item in the ListView.
          We use the inflater to inflate the layout file and obtain the root view of the item.

        kotlin
        Copy code
        val itemName = view.findViewById<TextView>(R.id.itemText)
        val description = view.findViewById<TextView>(R.id.itemDescription)
        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        In this code block, we find and assign the individual views within the card_layout XML to corresponding variables.
         We use the findViewById() method to locate the views by their unique IDs, which are specified in the XML layout file.
          In this case, we have itemText, itemDescription, and profile_image as the IDs of TextView and CircleImageView views.

        kotlin
        Copy code
                itemName.text = arrayList[position].itemText
        description.text = arrayList[position].description
        image.setBackgroundResource(arrayList[position].imageId)
        Here, we set the data for each view. The arrayList contains the data objects (userData instances) for each item in the ListView.
         We access the appropriate item at the given position and set the corresponding data to the views.
          For example, the itemName TextView displays the itemText value from the userData object at the current position.

        kotlin
        Copy code
                return view
        Finally, we return the fully configured view for the current item.
         This view will be displayed in the ListView as an individual item.

        To summarize, the ListViewAdapter class is responsible for creating and configuring views for each item in the ListView based on the data provided in the arrayList.
         It uses the card_layout XML file to define the appearance of each item and sets the appropriate data to the corresponding views.
       */