package com.jeferson.atividade3pdm2.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jeferson.atividade3pdm2.R;
import com.jeferson.atividade3pdm2.ui.adapters.DisciplinaAdapter;
import com.jeferson.atividade3pdm2.ui.models.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class SextoPeriodoFragments extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sexto_periodo, container, false);

        List<Disciplina> disciplinasSextoPeriodo = new ArrayList<>();
        disciplinasSextoPeriodo.add(new Disciplina("Programação 6", "médio"));
        disciplinasSextoPeriodo.add(new Disciplina("Gerência de Configuração", "difícil"));
        disciplinasSextoPeriodo.add(new Disciplina("PDMII", "difícil"));

        RecyclerView recyclerView = view.findViewById(R.id.rv_sexto_periodo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new DisciplinaAdapter(disciplinasSextoPeriodo));

        return view;
    }
}
