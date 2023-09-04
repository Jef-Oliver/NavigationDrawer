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

public class SegundoPeriodoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_segundo_periodo, container, false);

        List<Disciplina> disciplinasSegundoPeriodo = new ArrayList<>();
        disciplinasSegundoPeriodo.add(new Disciplina("Programação Básica Para Web", "médio"));
        disciplinasSegundoPeriodo.add(new Disciplina("Análise de Sistemas", "fácil"));
        disciplinasSegundoPeriodo.add(new Disciplina("Fund. e Projeto de Banco de Dados", "médio"));
        disciplinasSegundoPeriodo.add(new Disciplina("Introdução À Conectividade", "difícil"));

        RecyclerView recyclerView = view.findViewById(R.id.rv_segundo_periodo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new DisciplinaAdapter(disciplinasSegundoPeriodo));

        return view;
    }
}
