package com.example.java5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BasketballClubAdapter adapter;
    private List<BasketballClub> basketballClubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        basketballClubs = new ArrayList<>();
        basketballClubs.add(new BasketballClub("ФК Барселона", "Камп Ноу", "Хави", "1899")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Реал Мадрид", "Сантьяго Бернабеу", "Карло Анчелотти", "1902")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Манчестер Юнайтед", "Олд Траффорд", "Эрик тен Хаг", "1878")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Челси", "Стэмфорд Бридж", "Маурисио Почеттино", "1905")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Бавария Мюнхен", "Альянц Арена", "Юлиан Нагельсманн", "1900")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Ювентус", "Альянц Стэдиум", "Массимилиано Аллегри", "1897")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Пари Сен-Жермен", "Парк де Пренс", "Луис Энрике", "1970")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Ливерпуль", "Энфилд", "Юрген Клопп", "1892")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Манчестер Сити", "Этихад Стэдиум", "Пеп Гвардиола", "1880")); // Добавлен год основания
        basketballClubs.add(new BasketballClub("Арсенал", "Эмирейтс Стэдиум", "Микель Артета", "1886")); // Добавлен год основания

        adapter = new BasketballClubAdapter(this, basketballClubs);
        recyclerView.setAdapter(adapter);
    }
}
