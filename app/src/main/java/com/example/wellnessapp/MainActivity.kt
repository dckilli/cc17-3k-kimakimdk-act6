package com.example.wellnessapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wellnessapp.R
import com.example.a30daysapp.WellnessTip


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var wellnessAdapter: WellnessAdapter
    private lateinit var wellnessTipList: MutableList<WellnessTip>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        wellnessTipList = mutableListOf()
        populateWellnessTips() // Fill the list with data for 30 days

        wellnessAdapter = WellnessAdapter(wellnessTipList)
        recyclerView.adapter = wellnessAdapter
    }

    private fun populateWellnessTips() {
        // Add wellness tips for each day
        wellnessTipList.add(WellnessTip(1, "Hydrate", "Start your day with a glass of water to hydrate your body.", R.drawable.day1_image))
        wellnessTipList.add(WellnessTip(2, "Meditation", "Spend 10 minutes in meditation to center your thoughts.", R.drawable.day2_image))
        wellnessTipList.add(WellnessTip(3, "Healthy Breakfast", "Eat a balanced breakfast with protein, fiber, and healthy fats.", R.drawable.day3_image))
        wellnessTipList.add(WellnessTip(4, "Walk", "Take a 20-minute walk outdoors to improve your mood and get some exercise.", R.drawable.day4_image))
        wellnessTipList.add(WellnessTip(5, "Stretching", "Do a 10-minute stretching routine to improve flexibility.", R.drawable.day5_image))
        wellnessTipList.add(WellnessTip(6, "Gratitude", "Write down 3 things you are grateful for today.", R.drawable.day6_image))
        wellnessTipList.add(WellnessTip(7, "Limit Screen Time", "Reduce your screen time by 1 hour today to focus on other activities.", R.drawable.day7_image))
        wellnessTipList.add(WellnessTip(8, "Eat More Greens", "Add more green vegetables to your meals today.", R.drawable.day8_image))
        wellnessTipList.add(WellnessTip(9, "Deep Breathing", "Practice deep breathing for 5 minutes to reduce stress.", R.drawable.day9_image))
        wellnessTipList.add(WellnessTip(10, "Unplug", "Unplug from all electronic devices for at least 30 minutes.", R.drawable.day10_image))
        wellnessTipList.add(WellnessTip(11, "Sleep Hygiene", "Focus on improving your sleep by creating a bedtime routine.", R.drawable.day11_image))
        wellnessTipList.add(WellnessTip(12, "Drink Herbal Tea", "Replace coffee with herbal tea to calm your system.", R.drawable.day12_image))
        wellnessTipList.add(WellnessTip(13, "Declutter", "Spend 15 minutes decluttering your workspace or living area.", R.drawable.day13_image))
        wellnessTipList.add(WellnessTip(14, "Call a Friend", "Reach out to a friend or loved one for a meaningful conversation.", R.drawable.day14_image))
        wellnessTipList.add(WellnessTip(15, "Try Yoga", "Do a 20-minute yoga session to stretch and relax your body.", R.drawable.day15_image))
        wellnessTipList.add(WellnessTip(16, "Journal", "Write in your journal for 10 minutes to reflect on your day.", R.drawable.day16_image))
        wellnessTipList.add(WellnessTip(17, "Eat Mindfully", "Practice mindful eating by focusing on your food and savoring each bite.", R.drawable.day17_image))
        wellnessTipList.add(WellnessTip(18, "Limit Sugar", "Reduce your sugar intake by avoiding sugary snacks.", R.drawable.day18_image))
        wellnessTipList.add(WellnessTip(19, "Get Creative", "Engage in a creative activity such as drawing, painting, or writing.", R.drawable.day19_image))
        wellnessTipList.add(WellnessTip(20, "Take a Nap", "Allow yourself to take a short nap if you're feeling tired.", R.drawable.day20_image))
        wellnessTipList.add(WellnessTip(21, "Meal Prep", "Plan and prepare a healthy meal for the week ahead.", R.drawable.day21_image))
        wellnessTipList.add(WellnessTip(22, "Practice Self-Care", "Spend 30 minutes doing something that makes you feel good.", R.drawable.day22_image))
        wellnessTipList.add(WellnessTip(23, "Listen to Music", "Listen to your favorite music to lift your spirits.", R.drawable.day23_image))
        wellnessTipList.add(WellnessTip(24, "Digital Detox", "Avoid using any social media platforms for a day.", R.drawable.day24_image))
        wellnessTipList.add(WellnessTip(25, "Volunteer", "Do something kind for someone else today, either by helping or volunteering.", R.drawable.day25_image))
        wellnessTipList.add(WellnessTip(26, "Nature", "Spend time in nature and appreciate your surroundings.", R.drawable.day26_image))
        wellnessTipList.add(WellnessTip(27, "Learn Something New", "Spend 30 minutes learning a new skill or hobby.", R.drawable.day27_image))
        wellnessTipList.add(WellnessTip(28, "Cook a New Recipe", "Try cooking a new healthy recipe.", R.drawable.day28_image))
        wellnessTipList.add(WellnessTip(29, "Reflect", "Take time to reflect on the progress you've made over the past month.", R.drawable.day29_image))
        wellnessTipList.add(WellnessTip(30, "Celebrate", "Celebrate the wellness journey you've completed and set new goals.", R.drawable.day30_image))
    }
}