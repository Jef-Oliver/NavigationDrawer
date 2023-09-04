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

public class QuintoPeriodoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quinto_periodo, container, false);

        List<Disciplina> disciplinasQuintoPeriodo = new ArrayList<>();
        disciplinasQuintoPeriodo.add(new Disciplina("Programação 5", "médio"));
        disciplinasQuintoPeriodo.add(new Disciplina("Segurança de Sistemas", "difícil"));
        disciplinasQuintoPeriodo.add(new Disciplina("Padrões de Projeto", "difícil"));
        disciplinasQuintoPeriodo.add(new Disciplina("Novas Tec. em Desenvolvimento Para Web", "difícil"));

        RecyclerView recyclerView = view.findViewById(R.id.rv_quinto_periodo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new DisciplinaAdapter(disciplinasQuintoPeriodo));

        return view;
    }
}
