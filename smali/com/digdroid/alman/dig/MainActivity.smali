.class public Lcom/digdroid/alman/dig/MainActivity;
.super Lcom/digdroid/alman/dig/q3;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/MainActivity$l;
    }
.end annotation


# instance fields
.field t1:Z

.field u1:Z

.field v1:Z

.field w1:Landroidx/appcompat/widget/SearchView;

.field x1:Landroid/view/MenuItem;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;-><init>()V

    return-void
.end method

.method static synthetic X2(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/MainActivity;->a3()V

    return-void
.end method

.method static synthetic Y2(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/MainActivity;->b3()V

    return-void
.end method

.method private a3()V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/MainActivity;->t1:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/MainActivity$f;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/MainActivity$f;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/digdroid/alman/dig/d0;->k(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V

    return-void
.end method

.method private b3()V
    .locals 5

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v1, "data_version"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v0

    const/16 v3, 0x1c8

    const-string v4, "do_repair"

    if-lt v0, v3, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v4, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->o1()V

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v4, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v4, v2}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v1, v3}, Lcom/digdroid/alman/dig/b3;->E(Ljava/lang/String;I)V

    new-instance v0, Lcom/digdroid/alman/dig/g;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/digdroid/alman/dig/MainActivity$g;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/MainActivity$g;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/g;->g(Lcom/digdroid/alman/dig/g$a;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/e0;->k0(Z)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g;->e()V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/digdroid/alman/dig/MainActivity$l;

    invoke-direct {v0, p0, p0}, Lcom/digdroid/alman/dig/MainActivity$l;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/MainActivity;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method


# virtual methods
.method public J()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity;->x1:Landroid/view/MenuItem;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity;->w1:Landroidx/appcompat/widget/SearchView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity;->w1:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    return-void
.end method

.method public J1()V
    .locals 3

    new-instance v0, Lcom/digdroid/alman/dig/MainActivity$c;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/MainActivity$c;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method Z2()V
    .locals 7

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->s1()V

    move-object v1, v2

    :cond_1
    if-nez v1, :cond_3

    const-string v1, "system"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/e0;->p1(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->m1()V

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->t1()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->j()Z

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1, v4}, Lcom/digdroid/alman/dig/b3;->S(Z)V

    iput-boolean v3, p0, Lcom/digdroid/alman/dig/MainActivity;->u1:Z

    :cond_4
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/MainActivity;->u1:Z

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    :cond_5
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f110291

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/digdroid/alman/dig/MainActivity$i;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/MainActivity$i;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f110148

    new-instance v2, Lcom/digdroid/alman/dig/MainActivity$h;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/MainActivity$h;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_6
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_7

    return-void

    :cond_7
    const-string v1, "restore_success"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    iget-boolean v5, p0, Lcom/digdroid/alman/dig/MainActivity;->v1:Z

    if-nez v5, :cond_9

    new-instance v5, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v6

    invoke-direct {v5, p0, v6}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_8

    const v0, 0x7f110219

    goto :goto_1

    :cond_8
    const v0, 0x7f110216

    :goto_1
    invoke-virtual {v5, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101d8

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iput-boolean v3, p0, Lcom/digdroid/alman/dig/MainActivity;->v1:Z

    invoke-virtual {p0, v4, v3, v4}, Lcom/digdroid/alman/dig/t;->t0(ZZZ)V

    goto :goto_2

    :cond_9
    const-string v0, "check_paths"

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/DatabaseService;->t(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "com.digdroid.alman.dig.action.SYNC"

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/ServerService;->t(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v1, "auto_scan"

    invoke-virtual {v0, v1, v4}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v3, v0, v4}, Lcom/digdroid/alman/dig/t;->t0(ZZZ)V

    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_a

    return-void

    :cond_a
    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v0

    if-nez v0, :cond_b

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/digdroid/alman/dig/MainActivity$j;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/MainActivity$j;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_b
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/q3;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lcom/digdroid/alman/dig/y3;->u(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/32 v2, 0x493e0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/digdroid/alman/dig/y3;->E(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/digdroid/alman/dig/y3;->D(Landroid/content/Context;)V

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-lt v0, v1, :cond_2

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_2

    :try_start_0
    const-class v0, Landroid/os/StrictMode;

    const-string v1, "disableDeathOnFileUriExposure"

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_2
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Landroidx/appcompat/app/e;->A(Z)V

    if-nez p1, :cond_3

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/MainActivity;->u1:Z

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/MainActivity;->v1:Z

    goto :goto_1

    :cond_3
    const-string v0, "scan_alert"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/MainActivity;->u1:Z

    const-string v0, "restore_informed"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/MainActivity;->v1:Z

    :goto_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 12

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d000a

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const-string v0, "search"

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/SearchManager;

    const v1, 0x7f090285

    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iput-object v2, p0, Lcom/digdroid/alman/dig/MainActivity;->x1:Landroid/view/MenuItem;

    invoke-interface {v2}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/SearchView;

    iput-object v2, p0, Lcom/digdroid/alman/dig/MainActivity;->w1:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/SearchManager;->getSearchableInfo(Landroid/content/ComponentName;)Landroid/app/SearchableInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/SearchView;->setSearchableInfo(Landroid/app/SearchableInfo;)V

    new-instance v0, Lcom/digdroid/alman/dig/MainActivity$k;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/MainActivity$k;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$l;)V

    new-instance v0, Lcom/digdroid/alman/dig/MainActivity$b;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/MainActivity$b;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/SearchView;->setOnCloseListener(Landroidx/appcompat/widget/SearchView$k;)V

    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/MainActivity;->x1:Landroid/view/MenuItem;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result v0

    const v2, 0x7f090283

    const v3, 0x7f090282

    const v4, 0x7f090280

    const v5, 0x7f090067

    const v6, 0x7f090377

    const/4 v7, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1, v6}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {p1, v5}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return v7

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->o()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v8, p0, Lcom/digdroid/alman/dig/MainActivity;->x1:Landroid/view/MenuItem;

    invoke-interface {v8}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v9, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v10

    sget-object v11, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v9, v10, v11}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_4
    iget-object v9, p0, Lcom/digdroid/alman/dig/MainActivity;->x1:Landroid/view/MenuItem;

    invoke-interface {v9, v8}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    invoke-interface {p1, v6}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v6

    invoke-interface {v6, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->u0:Z

    invoke-interface {v6}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v8, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v9

    sget-object v10, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v8, v9, v10}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v8}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-interface {v6, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_5
    invoke-interface {p1, v5}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v5, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/b3;->v()Z

    move-result v5

    if-nez v5, :cond_6

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/u3;->v0:Z

    goto :goto_3

    :cond_6
    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v6, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v8

    iget-boolean v9, p0, Lcom/digdroid/alman/dig/u3;->w0:Z

    if-eqz v9, :cond_7

    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    :cond_7
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    :goto_2
    invoke-direct {v6, v8, v9}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-interface {v0, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_8
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->w0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->v0:Z

    :goto_3
    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->z1()Z

    move-result v4

    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v6

    sget-object v8, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6, v8}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_9
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->B1()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->A1()Z

    move-result v3

    if-nez v3, :cond_a

    const/4 v3, 0x1

    goto :goto_4

    :cond_a
    const/4 v3, 0x0

    :goto_4
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v5

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5, v6}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_b
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->B1()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->A1()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v1, 0x1

    :cond_c
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {p1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_d
    return v7
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/q3;->onDestroy()V

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d0;->y()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x1

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :sswitch_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/MainActivity;->J1()V

    return v1

    :sswitch_1
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->T1()V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->invalidateOptionsMenu()V

    return v1

    :sswitch_2
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->S1()V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->invalidateOptionsMenu()V

    return v1

    :sswitch_3
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/q3;->P1()V

    return v1

    :sswitch_4
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->l1()V

    return v1

    :sswitch_5
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e0;->V:Z

    const p1, 0x7f090170

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout;

    const v0, 0x800003

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->H(I)V

    return v1

    :sswitch_data_0
    .sparse-switch
        0x102002c -> :sswitch_5
        0x7f090067 -> :sswitch_4
        0x7f090280 -> :sswitch_3
        0x7f090282 -> :sswitch_2
        0x7f090283 -> :sswitch_1
        0x7f090377 -> :sswitch_0
    .end sparse-switch
.end method

.method public onResume()V
    .locals 6

    invoke-super {p0}, Lcom/digdroid/alman/dig/q3;->onResume()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v3, "retroarch_last"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v4, "retroarch"

    cmp-long v5, v0, v2

    if-lez v5, :cond_0

    invoke-static {p0, v4}, Lcom/digdroid/alman/dig/y3;->C(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const/4 v1, 0x0

    const-string v2, "retroarch_package_running"

    invoke-virtual {v0, v2, v1}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v4}, Lcom/digdroid/alman/dig/y3;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    new-instance v1, Landroidx/appcompat/app/b$a;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v2, 0x7f11021a

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v2, 0x7f11005a

    new-instance v3, Lcom/digdroid/alman/dig/MainActivity$e;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/MainActivity$e;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v2, 0x7f1101d8

    new-instance v3, Lcom/digdroid/alman/dig/MainActivity$d;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/MainActivity$d;-><init>(Lcom/digdroid/alman/dig/MainActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/digdroid/alman/dig/MainActivity;->a3()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/MainActivity;->u1:Z

    const-string v1, "scan_alert"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/MainActivity;->v1:Z

    const-string v1, "restore_informed"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/q3;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/a2;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/MainActivity;->t1:Z

    new-instance v0, Lcom/digdroid/alman/dig/MainActivity$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/MainActivity$a;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r2;->Y0(Lcom/digdroid/alman/dig/r2$c;)V

    return-void
.end method
