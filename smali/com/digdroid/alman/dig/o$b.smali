.class Lcom/digdroid/alman/dig/o$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o;->g(Landroid/database/Cursor;ILjava/lang/String;)I
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
.field a:Lc/a/c/u;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lcom/digdroid/alman/dig/o;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/o;Lc/a/c/u;JIIJLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/c/u;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    iput-wide p3, p0, Lcom/digdroid/alman/dig/o$b;->b:J

    iput p5, p0, Lcom/digdroid/alman/dig/o$b;->c:I

    iput p6, p0, Lcom/digdroid/alman/dig/o$b;->d:I

    iput-wide p7, p0, Lcom/digdroid/alman/dig/o$b;->e:J

    iput-object p9, p0, Lcom/digdroid/alman/dig/o$b;->f:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/o$b;->a:Lc/a/c/u;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 9

    const/4 p1, 0x1

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->a:Lc/a/c/u;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lc/a/c/u;->b:Lc/a/c/k;

    if-eqz v0, :cond_2

    iget v0, v0, Lc/a/c/k;->a:I

    const/16 v1, 0x194

    if-eq v0, v1, :cond_1

    const/16 v1, 0x19a

    if-eq v0, v1, :cond_1

    const/16 v1, 0x12c

    if-lt v0, v1, :cond_0

    const/16 v1, 0x190

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->b(Lcom/digdroid/alman/dig/o;)Lcom/digdroid/alman/dig/q;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/o$b;->d:I

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/q;->a(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/o$b;->b:J

    iget v3, p0, Lcom/digdroid/alman/dig/o$b;->c:I

    iget v4, p0, Lcom/digdroid/alman/dig/o$b;->d:I

    :goto_0
    invoke-virtual {v0, v3, v4}, Lcom/digdroid/alman/dig/o;->d(II)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/o$b;->b:J

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->b(Lcom/digdroid/alman/dig/o;)Lcom/digdroid/alman/dig/q;

    move-result-object v3

    iget v4, p0, Lcom/digdroid/alman/dig/o$b;->c:I

    iget v5, p0, Lcom/digdroid/alman/dig/o$b;->d:I

    iget-wide v6, p0, Lcom/digdroid/alman/dig/o$b;->e:J

    iget-object v8, p0, Lcom/digdroid/alman/dig/o$b;->f:Ljava/lang/String;

    invoke-virtual/range {v3 .. v8}, Lcom/digdroid/alman/dig/q;->e(IIJLjava/lang/String;)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->b(Lcom/digdroid/alman/dig/o;)Lcom/digdroid/alman/dig/q;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/o$b;->d:I

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/q;->a(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/o$b;->b:J

    iget v3, p0, Lcom/digdroid/alman/dig/o$b;->c:I

    iget v4, p0, Lcom/digdroid/alman/dig/o$b;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->b(Lcom/digdroid/alman/dig/o;)Lcom/digdroid/alman/dig/q;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/o$b;->d:I

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/q;->a(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$b;->g:Lcom/digdroid/alman/dig/o;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/o$b;->b:J

    iget v3, p0, Lcom/digdroid/alman/dig/o$b;->c:I

    iget v4, p0, Lcom/digdroid/alman/dig/o$b;->d:I

    invoke-virtual {v0, v3, v4}, Lcom/digdroid/alman/dig/o;->d(II)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/o$b;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
