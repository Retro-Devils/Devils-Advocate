.class Lcom/digdroid/alman/dig/g3$c$b$a$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3$c$b$a;->a([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "[",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/g3$c$b$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3$c$b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([[Ljava/lang/String;)Ljava/lang/Void;
    .locals 5

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c$b$a;->a:Lcom/digdroid/alman/dig/g3$c$b;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v3, v2, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    aget-object v4, p1, v1

    invoke-virtual {v3, v2, v4, v0}, Lcom/digdroid/alman/dig/h3;->a(Ljava/lang/String;Ljava/lang/String;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b$a;->a:Lcom/digdroid/alman/dig/g3$c$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b$a;->a:Lcom/digdroid/alman/dig/g3$c$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b$a;->a:Lcom/digdroid/alman/dig/g3$c$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t0;->O2()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b$a;->a:Lcom/digdroid/alman/dig/g3$c$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE rompaths SET selected=0 WHERE system=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3$c$b$a;->a:Lcom/digdroid/alman/dig/g3$c$b;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a:Lcom/digdroid/alman/dig/g3$c$b$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b$a;->a:Lcom/digdroid/alman/dig/g3$c$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$b;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->b:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->requery()Z

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [[Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g3$c$b$a$a;->a([[Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g3$c$b$a$a;->b(Ljava/lang/Void;)V

    return-void
.end method
