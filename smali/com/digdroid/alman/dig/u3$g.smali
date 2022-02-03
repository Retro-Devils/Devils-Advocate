.class Lcom/digdroid/alman/dig/u3$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/u3;->v1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/p1;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Landroid/widget/LinearLayout;

.field final synthetic e:Landroid/widget/LinearLayout;

.field final synthetic f:Lcom/digdroid/alman/dig/u3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3$g;->f:Lcom/digdroid/alman/dig/u3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/u3$g;->b:Lcom/digdroid/alman/dig/p1;

    iput-object p3, p0, Lcom/digdroid/alman/dig/u3$g;->c:Landroid/view/View;

    iput-object p4, p0, Lcom/digdroid/alman/dig/u3$g;->d:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lcom/digdroid/alman/dig/u3$g;->e:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$g;->b:Lcom/digdroid/alman/dig/p1;

    const-string v0, "none"

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/p1;->X2(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$g;->f:Lcom/digdroid/alman/dig/u3;

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3$g;->c:Landroid/view/View;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3$g;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3$g;->e:Landroid/widget/LinearLayout;

    const-string v3, "nont"

    invoke-virtual {p1, v3, v0, v1, v2}, Lcom/digdroid/alman/dig/u3;->D1(Ljava/lang/String;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$g;->f:Lcom/digdroid/alman/dig/u3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/u3;->v(Ljava/lang/String;)V

    return-void
.end method
