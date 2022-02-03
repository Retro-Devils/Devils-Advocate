.class Lcom/digdroid/alman/dig/o$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o;->g(Landroid/database/Cursor;ILjava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic f:Lcom/digdroid/alman/dig/o;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;JIIJ)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o$d;->f:Lcom/digdroid/alman/dig/o;

    iput-object p2, p0, Lcom/digdroid/alman/dig/o$d;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/digdroid/alman/dig/o$d;->b:J

    iput p5, p0, Lcom/digdroid/alman/dig/o$d;->c:I

    iput p6, p0, Lcom/digdroid/alman/dig/o$d;->d:I

    iput-wide p7, p0, Lcom/digdroid/alman/dig/o$d;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/u;)V
    .locals 11

    :try_start_0
    new-instance v10, Lcom/digdroid/alman/dig/o$b;

    iget-object v1, p0, Lcom/digdroid/alman/dig/o$d;->f:Lcom/digdroid/alman/dig/o;

    iget-wide v3, p0, Lcom/digdroid/alman/dig/o$d;->e:J

    iget v5, p0, Lcom/digdroid/alman/dig/o$d;->d:I

    iget v6, p0, Lcom/digdroid/alman/dig/o$d;->c:I

    iget-wide v7, p0, Lcom/digdroid/alman/dig/o$d;->b:J

    iget-object v9, p0, Lcom/digdroid/alman/dig/o$d;->a:Ljava/lang/String;

    move-object v0, v10

    move-object v2, p1

    invoke-direct/range {v0 .. v9}, Lcom/digdroid/alman/dig/o$b;-><init>(Lcom/digdroid/alman/dig/o;Lc/a/a/u;JIIJLjava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v10, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/o$d;->f:Lcom/digdroid/alman/dig/o;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/o$d;->e:J

    iget v2, p0, Lcom/digdroid/alman/dig/o$d;->d:I

    or-int/lit16 v2, v2, 0x4000

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    :goto_0
    return-void
.end method
