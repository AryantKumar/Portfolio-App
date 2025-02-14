<?xml version="1.0" encoding="utf-8"?>
<androidx.core.widget.NestedScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/background_color">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp">

        <!-- Heading TextView -->
        <TextView
            android:id="@+id/craftedWithLove"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:fontFamily="@font/poppins_medium"
            android:text="Crafted with ❤️"
            android:textColor="@color/textmain_color"
            android:textSize="20sp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Project 1 Card -->
        <com.google.android.material.card.MaterialCardView
            android:id="@+id/project1Card"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            app:cardCornerRadius="12dp"
            app:cardElevation="4dp"
            app:layout_constraintTop_toBottomOf="@id/craftedWithLove">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:padding="16dp">

                <TextView
                    android:id="@+id/project1Title"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_semibold"
                    android:text="Project Name 1"
                    android:textColor="@color/textmain_color"
                    android:textSize="18sp"
                    app:layout_constraintEnd_toStartOf="@id/project1Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />

                <TextView
                    android:id="@+id/project1Description"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_regular"
                    android:text="Description of project 1."
                    android:textColor="@color/textmain_color"
                    android:textSize="14sp"
                    app:layout_constraintEnd_toStartOf="@id/project1Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@id/project1Title" />

                <ImageView
                    android:id="@+id/project1Image"
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:scaleType="centerCrop"
                    android:src="@drawable/logo"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />
            </androidx.constraintlayout.widget.ConstraintLayout>
        </com.google.android.material.card.MaterialCardView>

        <!-- Project 2 Card -->
        <com.google.android.material.card.MaterialCardView
            android:id="@+id/project2Card"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            app:cardCornerRadius="12dp"
            app:cardElevation="4dp"
            app:layout_constraintTop_toBottomOf="@id/project1Card">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:padding="16dp">

                <TextView
                    android:id="@+id/project2Title"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_semibold"
                    android:text="Project Name 2"
                    android:textColor="@color/textmain_color"
                    android:textSize="18sp"
                    app:layout_constraintEnd_toStartOf="@id/project2Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />

                <TextView
                    android:id="@+id/project2Description"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_regular"
                    android:text="Description of project 2."
                    android:textColor="@color/textmain_color"
                    android:textSize="14sp"
                    app:layout_constraintEnd_toStartOf="@id/project2Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@id/project2Title" />

                <ImageView
                    android:id="@+id/project2Image"
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:scaleType="centerCrop"
                    android:src="@drawable/logo"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />
            </androidx.constraintlayout.widget.ConstraintLayout>
        </com.google.android.material.card.MaterialCardView>

        <!-- Project 3 Card -->
        <com.google.android.material.card.MaterialCardView
            android:id="@+id/project3Card"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            app:cardCornerRadius="12dp"
            app:cardElevation="4dp"
            app:layout_constraintTop_toBottomOf="@id/project2Card">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:padding="16dp">

                <TextView
                    android:id="@+id/project3Title"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_semibold"
                    android:text="Project Name 3"
                    android:textColor="@color/textmain_color"
                    android:textSize="18sp"
                    app:layout_constraintEnd_toStartOf="@id/project3Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />

                <TextView
                    android:id="@+id/project3Description"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_regular"
                    android:text="Description of project 3."
                    android:textColor="@color/textmain_color"
                    android:textSize="14sp"
                    app:layout_constraintEnd_toStartOf="@id/project3Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@id/project3Title" />

                <ImageView
                    android:id="@+id/project3Image"
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:scaleType="centerCrop"
                    android:src="@drawable/logo"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />
            </androidx.constraintlayout.widget.ConstraintLayout>
        </com.google.android.material.card.MaterialCardView>

        <!-- Project 4 Card -->
        <com.google.android.material.card.MaterialCardView
            android:id="@+id/project4Card"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            app:cardCornerRadius="12dp"
            app:cardElevation="4dp"
            app:layout_constraintTop_toBottomOf="@id/project3Card">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:padding="16dp">

                <TextView
                    android:id="@+id/project4Title"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_semibold"
                    android:text="Project Name 4"
                    android:textColor="@color/textmain_color"
                    android:textSize="18sp"
                    app:layout_constraintEnd_toStartOf="@id/project4Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />

                <TextView
                    android:id="@+id/project4Description"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="8dp"
                    android:layout_marginEnd="16dp"
                    android:fontFamily="@font/poppins_regular"
                    android:text="Description of project 4."
                    android:textColor="@color/textmain_color"
                    android:textSize="14sp"
                    app:layout_constraintEnd_toStartOf="@id/project4Image"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@id/project4Title" />

                <ImageView
                    android:id="@+id/project4Image"
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:scaleType="centerCrop"
                    android:src="@drawable/logo"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />
            </androidx.constraintlayout.widget.ConstraintLayout>
        </com.google.android.material.card.MaterialCardView>

    </androidx.constraintlayout.widget.ConstraintLayout>
</androidx.core.widget.NestedScrollView>
