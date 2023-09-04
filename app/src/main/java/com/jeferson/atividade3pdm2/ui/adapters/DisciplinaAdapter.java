package com.jeferson.atividade3pdm2.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeferson.atividade3pdm2.R;
import com.jeferson.atividade3pdm2.ui.models.Disciplina;

import java.util.List;


public class DisciplinaAdapter extends RecyclerView.Adapter<DisciplinaAdapter.DisciplinaViewHolder> {
    private List<Disciplina> disciplinas;

    public DisciplinaAdapter(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @NonNull
    @Override
    public DisciplinaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_disciplina, parent, false);
        return new DisciplinaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DisciplinaViewHolder holder, int position) {
        Disciplina disciplina = disciplinas.get(position);
        holder.textNomeDisciplina.setText(disciplina.getNome());

        int resourceId;
        switch (disciplina.getDificuldade()) {
            case "fácil":
                resourceId = R.drawable.ic_smile_sorrindo;
                break;
            case "médio":
                resourceId = R.drawable.ic_smile_pensando;
                break;
            case "difícil":
                resourceId = R.drawable.ic_smile_cansado;
                break;
            default:
                resourceId = R.drawable.ic_smile_neutro;
                break;
        }
        holder.imageDificuldade.setImageResource(resourceId);
    }

    @Override
    public int getItemCount() {
        return disciplinas.size();
    }

    static class DisciplinaViewHolder extends RecyclerView.ViewHolder {
        TextView textNomeDisciplina;
        ImageView imageDificuldade;

        public DisciplinaViewHolder(@NonNull View itemView) {
            super(itemView);
            textNomeDisciplina = itemView.findViewById(R.id.textNomeDisciplina);
            imageDificuldade = itemView.findViewById(R.id.imageDificuldade);
        }
    }
}
