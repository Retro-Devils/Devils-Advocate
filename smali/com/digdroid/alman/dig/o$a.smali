.class Lcom/digdroid/alman/dig/o$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o;->g(Landroid/database/Cursor;ILjava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/a/p$b<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:J

.field final synthetic f:I

.field final synthetic g:Lcom/digdroid/alman/dig/o;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o;IZLjava/lang/String;Ljava/lang/String;JI)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o$a;->g:Lcom/digdroid/alman/dig/o;

    iput p2, p0, Lcom/digdroid/alman/dig/o$a;->a:I

    iput-boolean p3, p0, Lcom/digdroid/alman/dig/o$a;->b:Z

    iput-object p4, p0, Lcom/digdroid/alman/dig/o$a;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/digdroid/alman/dig/o$a;->d:Ljava/lang/String;

    iput-wide p6, p0, Lcom/digdroid/alman/dig/o$a;->e:J

    iput p8, p0, Lcom/digdroid/alman/dig/o$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/o$a;->b([B)V

    return-void
.end method

.method public b([B)V
    .locals 11

    :try_start_0
    new-instance v10, Lcom/digdroid/alman/dig/o$c;

    iget-object v1, p0, Lcom/digdroid/alman/dig/o$a;->g:Lcom/digdroid/alman/dig/o;

    iget v3, p0, Lcom/digdroid/alman/dig/o$a;->f:I

    iget-wide v4, p0, Lcom/digdroid/alman/dig/o$a;->e:J

    iget-object v6, p0, Lcom/digdroid/alman/dig/o$a;->d:Ljava/lang/String;

    iget-object v7, p0, Lcom/digdroid/alman/dig/o$a;->c:Ljava/lang/String;

    iget-boolean v8, p0, Lcom/digdroid/alman/dig/o$a;->b:Z

    iget v9, p0, Lcom/digdroid/alman/dig/o$a;->a:I

    move-object v0, v10

    move-object v2, p1

    invoke-direct/range {v0 .. v9}, Lcom/digdroid/alman/dig/o$c;-><init>(Lcom/digdroid/alman/dig/o;[BIJLjava/lang/String;Ljava/lang/String;ZI)V

    sget-object p1, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v10, p1, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/o$a;->g:Lcom/digdroid/alman/dig/o;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/o$a;->e:J

    iget v2, p0, Lcom/digdroid/alman/dig/o$a;->a:I

    or-int/lit16 v2, v2, 0x4000

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    :goto_0
    return-void
.end method
