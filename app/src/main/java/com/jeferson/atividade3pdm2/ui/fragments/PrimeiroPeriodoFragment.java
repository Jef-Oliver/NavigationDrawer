package com.jeferson.atividade3pdm2.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jeferson.atividade3pdm2.R;
import com.jeferson.atividade3pdm2.ui.adapters.DisciplinaAdapter;
import com.jeferson.atividade3pdm2.ui.models.Disciplina;

import java.util.ArrayList;
import java.util.List;


public class PrimeiroPeriodoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_primeiro_periodo, container, false);

        List<Disciplina> disciplinasPrimeiroPeriodo = new ArrayList<>();
        disciplinasPrimeiroPeriodo.add(new Disciplina("Inglês Técnico", "fácil"));
        disciplinasPrimeiroPeriodo.add(new Disciplina("Introdução À Lógica", "médio"));
        disciplinasPrimeiroPeriodo.add(new Disciplina("F. Redes de Computadores", "médio"));
        disciplinasPrimeiroPeriodo.add(new Disciplina("Tendencias T. Para O Mercado de Ti", "médio"));
        disciplinasPrimeiroPeriodo.add(new Disciplina("Introdução À Computação", "Difícil"));
        disciplinasPrimeiroPeriodo.add(new Disciplina("Informática Instrumental", "Difícil"));

        RecyclerView recyclerView = view.findViewById(R.id.rv_primeiro_periodo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new DisciplinaAdapter(disciplinasPrimeiroPeriodo));

        return view;
    }
}
