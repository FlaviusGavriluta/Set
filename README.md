

# Subiect 1: Introducere în Interfața Set și Implementările Sale Comune

În Java, **Set** este o interfață din Java Collection Framework (JCF) care reprezintă o colecție de elemente
unde fiecare element este unic. Adică, nu puteți avea elemente duplicate într-un Set.

Cele mai utilizate implementări ale interfeței Set sunt:

* HashSet: Nu menține o ordine specifică a elementelor.
* LinkedHashSet: Menține ordinea de inserție a elementelor.
* TreeSet: Stochează elementele într-o ordine sortată.

```
Set<Integer> hashSet = new HashSet<>();
Set<Integer> linkedHashSet = new LinkedHashSet<>();
Set<Integer> treeSet = new TreeSet<>();
```


## Exercițiu 1: Creați un Set de numere întregi și adăugați elemente în el

## Exercițiu 2: Creați un Set de obiecte de tipul Student