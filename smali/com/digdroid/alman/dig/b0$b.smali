.class Lcom/digdroid/alman/dig/b0$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0;->v(Landroid/app/Activity;JJZ)V
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
.field final synthetic a:J

.field final synthetic b:J

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lcom/digdroid/alman/dig/b0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0;JJLandroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/b0$b;->a:J

    iput-wide p4, p0, Lcom/digdroid/alman/dig/b0$b;->b:J

    iput-object p6, p0, Lcom/digdroid/alman/dig/b0$b;->c:Landroid/app/Activity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 7

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b0;->c(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/o0;

    move-result-object v0

    iget-wide v1, p0, Lcom/digdroid/alman/dig/b0$b;->a:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b0;->b(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->g()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/digdroid/alman/dig/b0$b;->b:J

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/o0;->u(JJJ)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/b0$b;->a:J

    invoke-static {p1}, Lcom/digdroid/alman/dig/b0;->b(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/b3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/b3;->g()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b0;->e(JJ)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 4

    iget-wide v0, p0, Lcom/digdroid/alman/dig/b0$b;->b:J

    const-wide/16 v2, 0x7530

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    new-instance p1, Lcom/digdroid/alman/dig/v2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$b;->c:Landroid/app/Activity;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {v1}, Lcom/digdroid/alman/dig/b0;->d(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/u;

    move-result-object v1

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v2, 0x1

    new-instance v3, Lcom/digdroid/alman/dig/b0$b$a;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/b0$b$a;-><init>(Lcom/digdroid/alman/dig/b0$b;)V

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/digdroid/alman/dig/v2;-><init>(Landroid/app/Activity;Landroid/database/sqlite/SQLiteDatabase;ZLcom/digdroid/alman/dig/v2$j;)V

    iget-wide v0, p0, Lcom/digdroid/alman/dig/b0$b;->a:J

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/v2;->f(J)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0;->j:Lcom/digdroid/alman/dig/b0$k;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/b0$k;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/b0$b;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/b0$b;->b(Ljava/lang/Void;)V

    return-void
.end method
