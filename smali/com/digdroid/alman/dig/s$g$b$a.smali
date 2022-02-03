.class Lcom/digdroid/alman/dig/s$g$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$g$b;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/digdroid/alman/dig/s$g$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$g$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$g$b$a;->b:Lcom/digdroid/alman/dig/s$g$b;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s$g$b$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$g$b$a;->b:Lcom/digdroid/alman/dig/s$g$b;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$g$b;->c:Lcom/digdroid/alman/dig/s$g;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object v1, v0, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/r3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/s$g$b$a;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/digdroid/alman/dig/s;->f3(Lcom/digdroid/alman/dig/s;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Lcom/digdroid/alman/dig/n;->o(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$g$b$a;->b:Lcom/digdroid/alman/dig/s$g$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$g$b;->c:Lcom/digdroid/alman/dig/s$g;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->t0:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
