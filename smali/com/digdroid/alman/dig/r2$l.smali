.class Lcom/digdroid/alman/dig/r2$l;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->y3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "l"
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
.field final synthetic a:Lcom/digdroid/alman/dig/MainActivity;

.field final synthetic b:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$l;->b:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$l;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$l;->b:Lcom/digdroid/alman/dig/r2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/p1;->D2(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v1

    iput-object v1, p1, Lcom/digdroid/alman/dig/r2;->p0:[Ljava/io/File;

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$l;->b:Lcom/digdroid/alman/dig/r2;

    iget-object v1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->Z()Z

    move-result v1

    iput-boolean v1, p1, Lcom/digdroid/alman/dig/r2;->o0:Z

    return-object v0
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$l;->a:Lcom/digdroid/alman/dig/MainActivity;

    new-instance v0, Lcom/digdroid/alman/dig/r2$l$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/r2$l$a;-><init>(Lcom/digdroid/alman/dig/r2$l;)V

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/q3;->j(Lcom/digdroid/alman/dig/c4;Lcom/digdroid/alman/dig/q3$e;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r2$l;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r2$l;->b(Ljava/lang/Void;)V

    return-void
.end method
