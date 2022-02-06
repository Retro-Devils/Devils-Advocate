.class Lcom/digdroid/alman/dig/s$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$c;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/s$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    new-instance p1, Lcom/digdroid/alman/dig/r3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s$c;->c:Lcom/digdroid/alman/dig/s;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/r3;

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/r3;-><init>(Lcom/digdroid/alman/dig/r3;)V

    const-string p2, "name"

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$c;->c:Lcom/digdroid/alman/dig/s;

    const v1, 0x7f1101b9

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    iput-object p2, p1, Lcom/digdroid/alman/dig/r3;->f:Ljava/lang/String;

    const-class p2, Lcom/digdroid/alman/dig/s;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    iget-object v0, p1, Lcom/digdroid/alman/dig/s$c;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$c;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, v0, Lcom/digdroid/alman/dig/s;->w0:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$c;->c:Lcom/digdroid/alman/dig/s;

    invoke-static {p1}, Lcom/digdroid/alman/dig/s;->g3(Lcom/digdroid/alman/dig/s;)V

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$c;->c:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090374

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$c$a;->b:Lcom/digdroid/alman/dig/s$c;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s$c;->c:Lcom/digdroid/alman/dig/s;

    const/4 v0, 0x0

    iput v0, p2, Lcom/digdroid/alman/dig/s;->x0:I

    sget-object v1, Lcom/digdroid/alman/dig/s;->q0:[Ljava/lang/String;

    aget-object v0, v1, v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    iget p2, p2, Lcom/digdroid/alman/dig/s;->w0:I

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
