package com.example.parcial_faber;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView rvCards = vista.findViewById(R.id.rvCards);
        rvCards.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Tarjeta> lista = new ArrayList<>();
        lista.add(new Tarjeta("La hinchada",
                "Barranquilla vive el Junior con pasión en cada partido.",
                R.drawable.junior_hinchada,
                R.drawable.junior_hinchada));
        lista.add(new Tarjeta("Campeones",
                "La celebración con el trofeo del campeonato.",
                R.drawable.junior_trofeo,
                R.drawable.junior_trofeo));
        lista.add(new Tarjeta("A celebrar",
                "Festejo.",
                R.drawable.junior_gol,
                R.drawable.junior_gol));

        rvCards.setAdapter(new TarjetaAdapter(lista));
        return vista;
    }
}
