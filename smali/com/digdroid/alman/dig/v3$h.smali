.class Lcom/digdroid/alman/dig/v3$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v3;->x1()V
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

.field final synthetic f:Lcom/digdroid/alman/dig/v3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v3;Lcom/digdroid/alman/dig/p1;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v3$h;->f:Lcom/digdroid/alman/dig/v3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/v3$h;->b:Lcom/digdroid/alman/dig/p1;

    iput-object p3, p0, Lcom/digdroid/alman/dig/v3$h;->c:Landroid/view/View;

    iput-object p4, p0, Lcom/digdroid/alman/dig/v3$h;->d:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lcom/digdroid/alman/dig/v3$h;->e:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$h;->b:Lcom/digdroid/alman/dig/p1;

    const-string v0, "default"

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/p1;->Z2(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$h;->f:Lcom/digdroid/alman/dig/v3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/v3$h;->c:Landroid/view/View;

    iget-object v2, p0, Lcom/digdroid/alman/dig/v3$h;->d:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/digdroid/alman/dig/v3$h;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/digdroid/alman/dig/v3;->F1(Ljava/lang/String;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$h;->f:Lcom/digdroid/alman/dig/v3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/v3;->v(Ljava/lang/String;)V

    return-void
.end method
