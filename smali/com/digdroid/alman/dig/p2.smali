.class public abstract Lcom/digdroid/alman/dig/p2;
.super Lcom/digdroid/alman/dig/v3;
.source ""

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$c;
.implements Landroid/speech/RecognitionListener;
.implements Lcom/digdroid/alman/dig/x$d;


# static fields
.field static A0:Z

.field static B0:Z

.field static C0:Z

.field static z0:Landroidx/drawerlayout/widget/DrawerLayout;


# instance fields
.field D0:Landroid/speech/SpeechRecognizer;

.field E0:Landroidx/constraintlayout/widget/ConstraintLayout;

.field F0:Z

.field G0:Z

.field H0:Z

.field I0:Z

.field J0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field K0:[Z

.field L0:Landroid/os/Handler;

.field M0:I

.field N0:Landroid/view/ViewStub;

.field O0:I

.field P0:Landroid/view/ViewStub;

.field Q0:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/digdroid/alman/dig/v3;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/p2;->F0:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/p2;->G0:Z

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/p2;->H0:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/p2;->I0:Z

    const/16 v1, 0x21

    new-array v1, v1, [Z

    iput-object v1, p0, Lcom/digdroid/alman/dig/p2;->K0:[Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->L0:Landroid/os/Handler;

    const/4 v1, -0x1

    iput v1, p0, Lcom/digdroid/alman/dig/p2;->M0:I

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->N0:Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->P0:Landroid/view/ViewStub;

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/p2;->Q0:F

    return-void
.end method


# virtual methods
.method public E1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->H0:Z

    return v0
.end method

.method public G1(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/p2;->H0:Z

    return-void
.end method

.method M1()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x21

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/p2;->K0:[Z

    aput-boolean v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method N1(II)Z
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->K0:[Z

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    if-ltz p1, :cond_c

    array-length v2, v0

    if-lt p1, v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v2, 0x1

    if-ne p2, v2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    aget-boolean v4, v0, p1

    xor-int/2addr v4, v2

    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    return v2

    :cond_2
    if-ne p2, v2, :cond_3

    aput-boolean v1, v0, p1

    goto :goto_1

    :cond_3
    if-nez p2, :cond_4

    aput-boolean v2, v0, p1

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p2;->z1(I)Z

    move-result p2

    if-eqz p2, :cond_5

    return v2

    :cond_5
    if-eq p1, v2, :cond_6

    return v1

    :cond_6
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    if-eqz p1, :cond_8

    if-eqz v3, :cond_7

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    :cond_7
    return v1

    :cond_8
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    if-eqz p1, :cond_a

    if-eqz v3, :cond_9

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/e0;->H(Z)V

    :cond_9
    return v1

    :cond_a
    if-eqz v3, :cond_b

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->O1()Z

    move-result p1

    if-nez p1, :cond_b

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->W1()V

    :cond_b
    return v2

    :cond_c
    :goto_2
    return v1
.end method

.method O1()Z
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->F0:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->cancel()V

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/p2;->X1(Z)V

    return v1

    :cond_1
    sget-object v0, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    const v3, 0x800003

    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->A(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->f()V

    return v1

    :cond_2
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/e0;->H(Z)V

    return v1

    :cond_3
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->P1()Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->x2()Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0}, Lb/t/a/b;->getCurrentItem()I

    move-result v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->h()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x2

    goto :goto_0

    :cond_6
    const/4 v2, 0x1

    :goto_0
    if-lt v0, v2, :cond_7

    iget-object v2, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0, v1}, Lb/t/a/b;->K(IZ)V

    return v1

    :cond_7
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->W1()V

    return v1
.end method

.method P1()Z
    .locals 1

    invoke-static {}, Lcom/digdroid/alman/dig/MyEditText;->b()Z

    move-result v0

    return v0
.end method

.method Q1()V
    .locals 3

    invoke-static {p0}, Landroid/speech/SpeechRecognizer;->isRecognitionAvailable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->F0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->cancel()V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/p2;->X1(Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    new-instance v2, Lcom/digdroid/alman/dig/p2$h;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/p2$h;-><init>(Lcom/digdroid/alman/dig/p2;)V

    invoke-virtual {v0, p0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    :cond_1
    :goto_0
    return-void
.end method

.method abstract R1()V
.end method

.method S1()V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "language"

    const-string v2, "device"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/16 v1, 0xa

    new-array v2, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "en"

    aput-object v4, v2, v3

    const-string v5, "fr"

    const/4 v6, 0x1

    aput-object v5, v2, v6

    const/4 v5, 0x2

    const-string v6, "es"

    aput-object v6, v2, v5

    const/4 v5, 0x3

    const-string v6, "pt"

    aput-object v6, v2, v5

    const/4 v5, 0x4

    const-string v6, "it"

    aput-object v6, v2, v5

    const/4 v5, 0x5

    const-string v6, "de"

    aput-object v6, v2, v5

    const/4 v5, 0x6

    const-string v6, "ru"

    aput-object v6, v2, v5

    const/4 v5, 0x7

    const-string v6, "ja"

    aput-object v6, v2, v5

    const/16 v5, 0x8

    const-string v6, "ko"

    aput-object v6, v2, v5

    const/16 v5, 0x9

    const-string v6, "ar"

    aput-object v6, v2, v5

    const-string v5, "https://digdroid.com/faq"

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v6, v2, v3

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p0, v5}, Lcom/digdroid/alman/dig/e0;->z(Ljava/lang/String;)V

    return-void
.end method

.method public T1()V
    .locals 4

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    if-nez v0, :cond_1

    invoke-static {p0}, Landroid/speech/SpeechRecognizer;->createSpeechRecognizer(Landroid/content/Context;)Landroid/speech/SpeechRecognizer;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    invoke-virtual {v0, p0}, Landroid/speech/SpeechRecognizer;->setRecognitionListener(Landroid/speech/RecognitionListener;)V

    :cond_1
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->F0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->cancel()V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/p2;->X1(Z)V

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.speech.extra.LANGUAGE_MODEL"

    const-string v3, "free_form"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "calling_package"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v2, 0x1

    const-string v3, "android.speech.extra.PARTIAL_RESULTS"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :try_start_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    invoke-virtual {v2, v0}, Landroid/speech/SpeechRecognizer;->startListening(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v2

    invoke-direct {v0, p0, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v2, 0x7f110259

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v2, 0x7f1101da

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :goto_0
    return-void
.end method

.method abstract U1()V
.end method

.method abstract V1()V
.end method

.method W1()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "confirm_quit"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f110091

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f11005a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101da

    new-instance v2, Lcom/digdroid/alman/dig/p2$c;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/p2$c;-><init>(Lcom/digdroid/alman/dig/p2;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :goto_0
    return-void
.end method

.method X1(Z)V
    .locals 7

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->F0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/p2;->F0:Z

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->P0:Landroid/view/ViewStub;

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->P0:Landroid/view/ViewStub;

    if-nez v0, :cond_2

    const v0, 0x7f0903c8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/digdroid/alman/dig/p2;->P0:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_2
    const v0, 0x7f090445

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-eqz p1, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    if-eqz p1, :cond_6

    const p1, 0x7f090446

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const v0, 0x7f1100c9

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->I0:Z

    if-nez v0, :cond_4

    new-instance v0, Lcom/digdroid/alman/dig/p2$j;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/p2$j;-><init>(Lcom/digdroid/alman/dig/p2;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->I0:Z

    :cond_4
    const/high16 v0, 0x43c80000    # 400.0f

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/a4;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/p2;->O0:I

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget v1, p0, Lcom/digdroid/alman/dig/p2;->O0:I

    int-to-double v1, v1

    int-to-double v3, v0

    const-wide v5, 0x3feccccccccccccdL    # 0.9

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    cmpl-double v0, v1, v3

    if-lez v0, :cond_5

    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v1, v0

    iput v1, p0, Lcom/digdroid/alman/dig/p2;->O0:I

    :cond_5
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lcom/digdroid/alman/dig/p2;->O0:I

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6
    return-void
.end method

.method Y1(FF)Z
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->H0:Z

    sget-boolean v1, Lcom/digdroid/alman/dig/p2;->A0:Z

    if-eqz v1, :cond_c

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    if-nez v1, :cond_c

    sget-object v1, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    const v2, 0x800003

    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->A(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const/high16 v1, -0x40800000    # -1.0f

    invoke-static {p1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    const/16 v4, 0xc

    if-nez v3, :cond_2

    const/16 p1, 0xa

    goto :goto_0

    :cond_2
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {p1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-nez p1, :cond_3

    const/16 p1, 0xb

    goto :goto_0

    :cond_3
    invoke-static {p2, v1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-nez p1, :cond_4

    const/16 p1, 0x8

    goto :goto_0

    :cond_4
    invoke-static {p2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-nez p1, :cond_5

    const/16 p1, 0x9

    goto :goto_0

    :cond_5
    const/16 p1, 0xc

    :goto_0
    iget p2, p0, Lcom/digdroid/alman/dig/p2;->M0:I

    if-ne p1, p2, :cond_6

    return v0

    :cond_6
    iput p1, p0, Lcom/digdroid/alman/dig/p2;->M0:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->L0:Landroid/os/Handler;

    if-eqz p1, :cond_7

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_7
    iget p1, p0, Lcom/digdroid/alman/dig/p2;->M0:I

    if-gez p1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_c

    iget p2, p0, Lcom/digdroid/alman/dig/p2;->M0:I

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/p1;->y2(II)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    iget p1, p0, Lcom/digdroid/alman/dig/p2;->M0:I

    if-ne p1, v4, :cond_a

    return v2

    :cond_a
    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->L0:Landroid/os/Handler;

    if-nez p1, :cond_b

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/p2;->L0:Landroid/os/Handler;

    :cond_b
    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->L0:Landroid/os/Handler;

    new-instance p2, Lcom/digdroid/alman/dig/p2$d;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/p2$d;-><init>(Lcom/digdroid/alman/dig/p2;)V

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return v2

    :cond_c
    :goto_1
    return v0
.end method

.method public c0(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/digdroid/alman/dig/t0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/t0;->I3(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public d(Lcom/digdroid/alman/dig/h0;)V
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/p1;->T2(Lcom/digdroid/alman/dig/h0;)V

    :cond_0
    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->G0:Z

    sget-boolean v1, Lcom/digdroid/alman/dig/p2;->A0:Z

    if-nez v1, :cond_0

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/16 v1, 0xf

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    const/16 v2, 0x10

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v2

    invoke-virtual {p0, v1, v2}, Lcom/digdroid/alman/dig/p2;->Y1(FF)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const/16 v1, 0x11

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    float-to-double v4, v4

    const-wide v6, 0x3fb999999999999aL    # 0.1

    const-wide v8, 0x3f847ae147ae147bL    # 0.01

    cmpg-double v10, v4, v8

    if-gtz v10, :cond_2

    sput-boolean v2, Lcom/digdroid/alman/dig/p2;->B0:Z

    goto :goto_2

    :cond_2
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v4, v1

    cmpl-double v1, v4, v6

    if-ltz v1, :cond_5

    sget-boolean v1, Lcom/digdroid/alman/dig/p2;->B0:Z

    sput-boolean v0, Lcom/digdroid/alman/dig/p2;->B0:Z

    if-eqz v1, :cond_5

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v1, 0x39

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2;->K0:[Z

    if-eqz v1, :cond_4

    if-ltz p1, :cond_4

    array-length v3, v1

    if-lt p1, v3, :cond_3

    goto :goto_1

    :cond_3
    aput-boolean v2, v1, p1

    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/digdroid/alman/dig/p2;->N1(II)Z

    move-result p1

    return p1

    :cond_4
    :goto_1
    return v0

    :cond_5
    :goto_2
    const/16 v1, 0x12

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    sub-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-double v3, v3

    cmpg-double v5, v3, v8

    if-gtz v5, :cond_6

    sput-boolean v2, Lcom/digdroid/alman/dig/p2;->C0:Z

    goto :goto_3

    :cond_6
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v3, v1

    cmpl-double v1, v3, v6

    if-ltz v1, :cond_7

    sget-boolean v1, Lcom/digdroid/alman/dig/p2;->C0:Z

    sput-boolean v0, Lcom/digdroid/alman/dig/p2;->C0:Z

    if-eqz v1, :cond_7

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->K0:[Z

    aput-boolean v2, v0, p1

    goto :goto_0

    :cond_7
    :goto_3
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->H0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->G0:Z

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    const/16 v3, 0x61

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->P1()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_2
    sget-boolean v4, Lcom/digdroid/alman/dig/p2;->A0:Z

    if-eqz v4, :cond_b

    iget-boolean v4, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    if-nez v4, :cond_b

    iget-boolean v4, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    if-nez v4, :cond_b

    sget-object v4, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    const v5, 0x800003

    invoke-virtual {v4, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->A(I)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_5

    if-eqz v3, :cond_4

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_4
    return v2

    :cond_5
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_6
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_7

    const/16 v1, 0x9

    if-eq v0, v1, :cond_7

    const/16 v1, 0xa

    if-eq v0, v1, :cond_7

    const/16 v1, 0xb

    if-eq v0, v1, :cond_7

    const/16 v1, 0xc

    if-eq v0, v1, :cond_7

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    move-result v1

    const/16 v3, 0x401

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_a

    :cond_7
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    invoke-virtual {v1, v0, v3}, Lcom/digdroid/alman/dig/p1;->y2(II)Z

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/p2;->N1(II)Z

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iput-boolean v2, p0, Lcom/digdroid/alman/dig/p2;->H0:Z

    :cond_a
    :goto_2
    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_b
    :goto_3
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    if-eqz v1, :cond_c

    if-eqz v3, :cond_c

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v2, :cond_c

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    :cond_c
    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->G0:Z

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public f(Landroid/view/MenuItem;)Z
    .locals 4

    sget-object v0, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->f()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/digdroid/alman/dig/p2$i;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/p2$i;-><init>(Lcom/digdroid/alman/dig/p2;Landroid/view/MenuItem;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p1, 0x1

    return p1
.end method

.method public f0(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "settings"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "edit theme"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "home"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "help"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "faq"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_5
    const-string v0, "frequently asked questions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_6
    const-string v0, "options"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_7
    const-string v0, "genres"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_8
    const-string v0, "played games"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_9
    const-string v0, "systems"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_a
    const-string v0, "favorites"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_b
    const-string v0, "all games"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object p1, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t3;->j:Ljava/lang/String;

    const-string v0, ".*custom(\\d)+\\.cfg"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/e0;->x(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {p1, v1}, Lb/t/a/b;->setCurrentItem(I)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->S1()V

    goto :goto_1

    :pswitch_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->F()V

    goto :goto_1

    :pswitch_4
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->h0()V

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->b0()V

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->p()V

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->u()V

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->L()V

    :cond_c
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x717dbc7e -> :sswitch_b
        -0x6a6895a9 -> :sswitch_a
        -0x678e2bdc -> :sswitch_9
        -0x4b65c8cc -> :sswitch_8
        -0x4a79d8b0 -> :sswitch_7
        -0x4a797962 -> :sswitch_6
        -0x4835f140 -> :sswitch_5
        0x18b16 -> :sswitch_4
        0x30cf41 -> :sswitch_3
        0x30f4df -> :sswitch_2
        0x1c91c833 -> :sswitch_1
        0x5582bc23 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public getFilter()Lcom/digdroid/alman/dig/h0;
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/digdroid/alman/dig/t0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t0;->C3()Lcom/digdroid/alman/dig/h0;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/h0;

    invoke-direct {v0}, Lcom/digdroid/alman/dig/h0;-><init>()V

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->G0:Z

    return v0
.end method

.method public o()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    sget-boolean v0, Lcom/digdroid/alman/dig/p2;->A0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->O1()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public onBeginningOfSpeech()V
    .locals 0

    return-void
.end method

.method public onBufferReceived([B)V
    .locals 0

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/v3;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->L0()Landroidx/appcompat/app/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->s(Z)V

    sget-object v1, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/t3;->f()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/a;->t(I)V

    const p1, 0x7f090171

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout;

    sput-object p1, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    new-instance v1, Lcom/digdroid/alman/dig/p2$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/p2$b;-><init>(Lcom/digdroid/alman/dig/p2;)V

    invoke-virtual {p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerListener(Landroidx/drawerlayout/widget/DrawerLayout$d;)V

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const p1, 0x7f0902ca

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/navigation/NavigationView;

    invoke-virtual {p1, p0}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$c;)V

    invoke-static {p0, p1}, Lcom/digdroid/alman/dig/q3;->t(Landroid/content/Context;Lcom/google/android/material/navigation/NavigationView;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->M1()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v1, 0x13

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v2, 0x16

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v2, 0x17

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xc

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v2, 0x60

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "button_x_bind"

    const/4 v4, 0x3

    invoke-virtual {v2, v3, v4}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "button_y_bind"

    const/4 v4, 0x2

    invoke-virtual {v2, v3, v4}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "button_l1_bind"

    const/4 v4, 0x4

    invoke-virtual {v2, v3, v4}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "button_r1_bind"

    const/4 v5, 0x5

    invoke-virtual {v2, v3, v5}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "button_l2_bind"

    const/16 v5, 0xe

    invoke-virtual {v2, v3, v5}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "button_r2_bind"

    const/16 v5, 0xd

    invoke-virtual {v2, v3, v5}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "button_lthumb_bind"

    invoke-virtual {v2, v3, v1}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x6b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "button_rthumb_bind"

    const/16 v3, 0x11

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x39

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "button_lt_bind"

    const/4 v3, 0x6

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "button_rt_bind"

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x6c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "button_start_bind"

    const/4 v3, 0x7

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "button_select_bind"

    const/16 v3, 0x10

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->J0:Ljava/util/HashMap;

    const/16 v0, 0x6d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/c;->onDestroy()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->D0:Landroid/speech/SpeechRecognizer;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public onEndOfSpeech()V
    .locals 0

    return-void
.end method

.method public onError(I)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p2;->X1(Z)V

    return-void
.end method

.method public onEvent(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onPartialResults(Landroid/os/Bundle;)V
    .locals 2

    const v0, 0x7f090446

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "results_recognition"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/v3;->onPause()V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/digdroid/alman/dig/p2;->A0:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->L0:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReadyForSpeech(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/p2;->Q0:F

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p2;->X1(Z)V

    return-void
.end method

.method public onResults(Landroid/os/Bundle;)V
    .locals 4

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f090446

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const-string v1, "results_recognition"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/digdroid/alman/dig/p2$a;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/p2$a;-><init>(Lcom/digdroid/alman/dig/p2;Ljava/util/ArrayList;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 4

    invoke-super {p0}, Lcom/digdroid/alman/dig/v3;->onResume()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->B()Landroid/view/Menu;

    move-result-object v0

    const v1, 0x7f0902be

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f1100e1

    goto :goto_0

    :cond_0
    const v2, 0x7f110142

    :goto_0
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    const v1, 0x7f090385

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "show_foreground"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f110115

    goto :goto_1

    :cond_1
    const v1, 0x7f11024a

    :goto_1
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->M1()V

    sput-boolean v3, Lcom/digdroid/alman/dig/p2;->A0:Z

    return-void
.end method

.method public onRmsChanged(F)V
    .locals 3

    iget v0, p0, Lcom/digdroid/alman/dig/p2;->Q0:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Lcom/digdroid/alman/dig/p2;->Q0:F

    :cond_0
    iget v0, p0, Lcom/digdroid/alman/dig/p2;->Q0:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/p2;->X1(Z)V

    const v0, 0x7f090341

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lcom/digdroid/alman/dig/p2;->O0:I

    int-to-float v2, v2

    mul-float v2, v2, p1

    iget p1, p0, Lcom/digdroid/alman/dig/p2;->Q0:F

    div-float/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-static {p0, v2}, Lcom/digdroid/alman/dig/a4;->e(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->G0:Z

    invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public y()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method z1(I)Z
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p1, v0, :cond_11

    const/4 v0, 0x3

    if-eq p1, v0, :cond_10

    const/4 v0, 0x4

    if-eq p1, v0, :cond_e

    const/4 v0, 0x5

    if-eq p1, v0, :cond_a

    const/4 v0, 0x6

    if-eq p1, v0, :cond_8

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_1

    goto :goto_2

    :pswitch_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->e3()V

    :cond_0
    return v1

    :pswitch_1
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->R1()V

    goto :goto_2

    :pswitch_2
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->V1()V

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->U1()V

    :goto_0
    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/v3;->v(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2;->N0:Landroid/view/ViewStub;

    if-nez v1, :cond_1

    const v1, 0x7f0903c9

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewStub;

    iput-object v1, p0, Lcom/digdroid/alman/dig/p2;->N0:Landroid/view/ViewStub;

    invoke-virtual {v1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v1

    goto :goto_1

    :cond_1
    const v1, 0x7f090223

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    :goto_1
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v2, Lcom/digdroid/alman/dig/p2$g;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/p2$g;-><init>(Lcom/digdroid/alman/dig/p2;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const v1, 0x7f090222

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, -0x27ddddde

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    const v2, 0x7f09022c

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->s2()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    :goto_2
    return v0

    :pswitch_5
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    const/16 v0, 0x11

    new-instance v2, Lcom/digdroid/alman/dig/p2$f;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/p2$f;-><init>(Lcom/digdroid/alman/dig/p2;)V

    invoke-virtual {p1, p0, v0, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return v1

    :pswitch_6
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->q2()V

    :cond_3
    return v1

    :pswitch_7
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->b0()V

    return v1

    :pswitch_8
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->S1()V

    return v1

    :pswitch_9
    iget-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->F()V

    :cond_4
    return v1

    :pswitch_a
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->L()V

    return v1

    :pswitch_b
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->u()V

    return v1

    :pswitch_c
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->h0()V

    return v1

    :pswitch_d
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->p()V

    return v1

    :pswitch_e
    iget-object p1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {p1, v0}, Lb/t/a/b;->setCurrentItem(I)V

    return v1

    :pswitch_f
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->c3()V

    :cond_5
    return v1

    :pswitch_10
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/p1;->E2(Z)V

    :cond_6
    return v1

    :pswitch_11
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/p1;->E2(Z)V

    :cond_7
    return v1

    :cond_8
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->N2()Z

    :cond_9
    return v1

    :cond_a
    iget-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/c3;->j:Ljava/lang/String;

    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3;->r0:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->A()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3;->r0:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->w()Z

    goto :goto_3

    :cond_b
    iget-object p1, p0, Lcom/digdroid/alman/dig/v3;->r0:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->O()Z

    goto :goto_3

    :cond_c
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->r2()I

    move-result v0

    if-ltz v0, :cond_d

    new-instance v0, Lb/a/o/d;

    const v2, 0x7f12000c

    invoke-direct {v0, p0, v2}, Lb/a/o/d;-><init>(Landroid/content/Context;I)V

    new-instance v2, Landroidx/appcompat/widget/l0;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/v3;->I()Landroid/view/View;

    move-result-object v3

    const v4, 0x800005

    invoke-direct {v2, v0, v3, v4}, Landroidx/appcompat/widget/l0;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    invoke-virtual {v2}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v0

    invoke-virtual {v2}, Landroidx/appcompat/widget/l0;->b()Landroid/view/MenuInflater;

    move-result-object v3

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->r2()I

    move-result v4

    invoke-virtual {v3, v4, v0}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/p1;->p2(Landroid/view/Menu;)V

    new-instance v0, Lcom/digdroid/alman/dig/p2$e;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/p2$e;-><init>(Lcom/digdroid/alman/dig/p2;Lcom/digdroid/alman/dig/p1;)V

    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/l0;->c(Landroidx/appcompat/widget/l0$d;)V

    invoke-virtual {v2}, Landroidx/appcompat/widget/l0;->d()V

    :cond_d
    :goto_3
    return v1

    :cond_e
    sget-object p1, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    const v0, 0x800003

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->A(I)Z

    move-result p1

    if-eqz p1, :cond_f

    sget-object p1, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->f()V

    goto :goto_4

    :cond_f
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e0;->V:Z

    sget-object p1, Lcom/digdroid/alman/dig/p2;->z0:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->H(I)V

    :goto_4
    return v1

    :cond_10
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->Q1()V

    return v1

    :cond_11
    iget-object p1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {p1}, Lb/t/a/b;->getCurrentItem()I

    move-result p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/l2;->c()I

    move-result v0

    if-ge p1, v0, :cond_12

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    add-int/2addr p1, v1

    invoke-virtual {v0, p1, v1}, Lb/t/a/b;->K(IZ)V

    :cond_12
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1d
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
