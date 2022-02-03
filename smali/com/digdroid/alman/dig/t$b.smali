.class Lcom/digdroid/alman/dig/t$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Z

.field final synthetic d:Lcom/digdroid/alman/dig/t;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/t;ZZZ)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/t$b;->c:Z

    iput-boolean p3, p0, Lcom/digdroid/alman/dig/t$b;->b:Z

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/t$b;->a:Z

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->c(Landroid/content/Context;)V

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/t$b;->b:Z

    const-string v0, "scan_dirs"

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/c3;->e()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/t$b;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/h3;

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/t$b;->a:Z

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/h3;->e(Z)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "find_dirs"

    invoke-static {p1, v1}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "com.digdroid.alman.dig.action.SYNC"

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/ServerService;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "kill_orphans"

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$b;->d:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "merge_games"

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t$b;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
